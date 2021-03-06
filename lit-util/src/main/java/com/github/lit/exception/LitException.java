package com.github.lit.exception;

import lombok.Getter;
import lombok.Setter;

/**
 * User : liulu
 * Date : 2018-03-11 13:37
 * version $Id: LitException.java, v 0.1 Exp $
 */
class LitException extends RuntimeException {

    @Getter
    @Setter
    String code;

    LitException() {
        super();
    }

    LitException(String message) {
        super(message);
    }

    LitException(String code, String message) {
        super(message);
        this.code = code;
    }

    LitException(String message, Throwable cause) {
        super(message, cause);
    }

    LitException(String code, String message, Throwable cause) {
        super(message, cause);
    }

    LitException(Throwable cause) {
        super(cause);
    }


}
