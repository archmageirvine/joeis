package irvine.math.function;

import irvine.math.z.Z;

/**
 * Ceiling square root.
 * @author Sean A. Irvine
 */
class NextPowerOf2 extends AbstractFunction1 {

  @Override
  public Z z(final Z n) {
    return Z.ONE.shiftLeft(n.bitLength());
  }

  /**
   * Return the smallest power of 2 which is larger than <code>x</code>.
   * If <code>x</code> &gt;= 2<sup>62</sup>, then the result is
   * <code>Long.MIN_VALUE</code> (which is the correct result if
   * the result is considered to be unsigned). If <code>x &lt; 0</code>,
   * then the result is 0.
   *
   * @param x value to round up
   * @return a power of 2
   */
  @Override
  public long l(final long n) {
    if (n > 0) {
      final long t = 1L << ((Double.doubleToLongBits(n) >> 52) - 1023);
      return t > 0 && t <= n ? t << 1 : t;
    }
    return n == 0 ? 1 : 0;
    /* // alternative implementation
    n |= n >> 1;
    n |= n >> 2;
    n |= n >> 4;
    n |= n >> 8;
    n |= n >> 16;
    n |= n >> 32;
    return n + 1;
    */
  }

  @Override
  public int i(int n) {
    n |= n >> 1;
    n |= n >> 2;
    n |= n >> 4;
    n |= n >> 8;
    n |= n >> 16;
    return n + 1;
  }

}
