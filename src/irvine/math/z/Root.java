package irvine.math.z;

import irvine.math.IntegerUtils;

/**
 * Root finding.
 *
 * @author Sean A. Irvine
 */
final class Root {

  private Root() { }

  /** nth root by Newton's method, sets auxiliary. */
  private static Z rootNewton(final Z z, final int n) {
    final int lga = z.bitLength();
    int k = (lga + n - 1) / n;
    Z b = Z.ONE.shiftLeft(k);
    // choose between bisection method and Newton's method
    if (n >= 16 && 2 * IntegerUtils.lg(lga) + IntegerUtils.lg(n) > k) {
      // bisection method
      Z lowb = Z.ONE.shiftLeft((lga - n + 1) / n);
      Z highb = b;
      Z c = Z.ZERO;
      while (lowb.compareTo(highb) < 0) {
        c = lowb.add(highb).divide2();
        k = c.pow(n).compareTo(z);
        if (k <= 0) {
          if (k == 0) {
            z.mAuxiliary = 1L;
            return c;
          } else {
            lowb = c.add(1L);
          }
        } else {
          highb = c;
        }
      }
      k = c.pow(n).compareTo(z);
      if (k == 0) {
        z.mAuxiliary = 1L;
      } else {
        if (k > 0) {
          c = c.subtract(Z.ONE);
        }
        z.mAuxiliary = 0L;
      }
      return c;
    } else {
      // Newton
      Z c;
      do {
        c = b.subtract(z.divide(b.pow(n - 1))).divide(n);
        b = b.subtract(c);
      } while (c.signum() > 0);
      c = b.pow(n);
      while ((k = c.compareTo(z)) > 0) {
        b = b.subtract(Z.ONE);
        c = b.pow(n);
      }
      z.mAuxiliary = k == 0 ? 1L : 0L;
      return b;
    }
  }

  /**
   * Compute the <code>n</code>th root of this integer. In addition
   * the auxiliary is set to 1 for a perfect <code>n</code>th root
   * and 0 otherwise.
   *
   * @param aa number to take root of
   * @param n root number
   * @return <code>n</code>th root
   * @exception ArithmeticException for n zero or even root of
   * negative number or negative root of zero.
   */
  static Z root(final Z aa, final int n) {
    final int sa = aa.signum();
    final boolean oknegative = sa < 0 && (n & 1) != 0;
    final Z a = oknegative ? aa.negate() : aa;
    final Z b;
    if ((sa > 0 && n > 1) || oknegative) {
      b = rootNewton(a, n);
      aa.mAuxiliary = a.auxiliary();
    } else if (n == 1 || (sa == 0 && n > 0)) {
      aa.mAuxiliary = 1L;
      b = a;
    } else if (n == 0) {
      throw new ArithmeticException("Attempt to take zeroth root.");
    } else if (sa < 0) {
      throw new ArithmeticException("Attempt to take even root of negative number.");
    } else if (sa == 0 && n < 0) {
      throw new ArithmeticException("Attempt to take negative root of zero.");
    } else {
      aa.mAuxiliary = 1L;
      b = Z.ZERO;
    }
    return sa < 0 ? b.negate() : b;
  }

}
