package irvine.math.r;

/**
 * Various functions associated with powering.
 *
 * @author Sean A. Irvine
 */
public final class Power {

  private Power() { }

  /**
   * Multiply x by a power of two; that is, return <code>x * 2^{pw2}</code>.
   *
   * @param x parameter
   * @param pw2 exponent
   * @return <code>x * 2^{pw2}</code>
   */
  public static double pow2(double x, int pw2) {
    if (pw2 == 0) {
      return x;
    }
    if (x == 0) {
      return 0;
    }
    if (x == Double.POSITIVE_INFINITY) {
      return x;
    }
    if (x == Double.NEGATIVE_INFINITY) {
      return x;
    }
    if (Double.isNaN(x)) {
      return x;
    }
    int e;
    long q;
    while ((e = ((int) ((q = Double.doubleToLongBits(x)) >>> 52)) & 0x7FF) == 0) {
      // input is denormal
      if (pw2 > 0) {
        x *= 2;
        --pw2;
      } else if (pw2 < 0) {
        if (pw2 <= -53) {
          return 0;
        }
        while (pw2 != 0) {
          x /= 2;
          if (x == 0) {
            return 0;
          }
          ++pw2;
        }
      }
      if (pw2 == 0) {
        return x;
      }
    }

    e += pw2;

    // handle overflow
    if (e >= 0x7FF) {
      return x > 0 ? Double.POSITIVE_INFINITY : Double.NEGATIVE_INFINITY;
    }
    // handle denormalized results
    if (e < 1) {
      if (e < -53) {
        return 0;
      }
      q &= 0x800FFFFFFFFFFFFFL;
      q |= 0x10000000000000L;
      /* For denormals, significant bits may be lost even
         when dividing by 2.  Construct 2^-(1-e) so the result
         is obtained with only one multiplication.  */
      return Double.longBitsToDouble(q) * pow2(1, e - 1);
    } else {
      q &= 0x800FFFFFFFFFFFFFL;
      q |= (long) (e & 0x7FF) << 52;
      return Double.longBitsToDouble(q);
    }
  }

  static double sNormalizedMantissa;
  /**
   * Get the exponent part of the specified double. Also sets the
   * variable <code>sNormalizedMantissa</code> to be the fractional bits
   * of x.
   *
   * @param x parameter
   * @return exponent of x
   */
  public static int getExponent(double x) {
    if (x == 0) {
      sNormalizedMantissa = 0;
      return 0;
    }
    long u = Double.doubleToLongBits(x);
    int i = (int) (u >>> 52) & 0x7FF;
    if (i == 0) {
      int k;
      // handle denormal
      do {
        x *= 2;
        --i;
        k = (int) (Double.doubleToLongBits(x) >>> 52) & 0x7FF;
      } while (k == 0);
      i += k;
    }
    i -= 0x3FE;
    u = Double.doubleToLongBits(x);
    u &= 0x800FFFFFFFFFFFFFL;
    u |= 0x3FE0000000000000L;
    sNormalizedMantissa = Double.longBitsToDouble(u);
    return i;
  }


  /**
   * Compute the cube root of x
   *
   * @param x parameter
   * @return cube root of x
   */
  public static double cbrt(double x) {
    final boolean sign;
    if (x <= 1) {
      if (x == 0) {
        return 0;
      }
      if (x == Double.NEGATIVE_INFINITY) {
        return x;
      }
      if (x == 1) {
        return 1;
      }
      if (x == -1) {
        return -1;
      }
      sign = x <= 0;
      if (sign) {
        x = -x;
      }
    } else {
      sign = false;
      if (x == Double.POSITIVE_INFINITY) {
        return x;
      }
      if (Double.isNaN(x)) {
        return x;
      }
    }
    final double z = x;
    int e = getExponent(x);
    x = sNormalizedMantissa;
    // approximate root of number between .5 and 1
    x = (((-1.3466110473359520655053E-1 * x + 5.4664601366395524503440E-1) * x - 9.5438224771509446525043E-1) * x + 1.1399983354717293273738E0) * x + 4.0238979564544752126924E-1;
    // exponent divided by 3
    int rem;
    if (e >= 0) {
      rem = e;
      e /= 3;
      rem -= 3 * e;
      if (rem == 1) {
        x *= 1.2599210498948731647672; // cbrt(2)
      } else if (rem == 2) {
        x *= 1.5874010519681994747517; // cbrt(4)
      }
    } else {
      e = -e;
      rem = e;
      e /= 3;
      rem -= 3 * e;
      if (rem == 1) {
        x *= 0.79370052598409973737585; // 1/cbrt(2)
      } else if (rem == 2) {
        x *= 0.62996052494743658238361; // 1/cbrt(4)
      }
      e = -e;
    }
    x = pow2(x, e);
    // Newton iteration
    x -= (x - (z / (x * x))) * 0.33333333333333333333;
    x -= (x - (z / (x * x))) * 0.33333333333333333333;
    return sign ? -x : x;
  }

}
