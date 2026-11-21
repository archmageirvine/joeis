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
}
