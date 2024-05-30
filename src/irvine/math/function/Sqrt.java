package irvine.math.function;

import irvine.math.z.Z;

/**
 * Truncating square root (floor square root).
 * @author Sean A. Irvine
 */
class Sqrt extends AbstractFunction1 {

  private static final int BITS = Long.SIZE - 2;

  @Override
  public Z z(final Z n) {
    return n.sqrt();
  }

  @Override
  public long l(final long n) {
    // WARNING: Simply doing (long) Math.sqrt(n) does not work for n > ~2^52.
    if (n < 1L << 52) {
      return (long) Math.sqrt(n);
    }
    long na = 3L << (2 * ((BITS >>> 1) - 1));
    long a = 1L << (BITS >>> 1);
    while ((n & na) == 0L) {
      na >>>= 2;
      a >>>= 1;
    }
    while (true) {
      final long ndiva = n / a;
      na = (ndiva + a) >>> 1;
      if (na - ndiva <= 1) {
        return na * na <= n ? na : ndiva;
      }
      a = na;
    }
  }

  @Override
  public int i(final int n) {
    return (int) Math.sqrt(n);
  }
}
