package irvine.math.function;

import irvine.math.z.Z;

/**
 * Mertens function.
 * Sum of the Mobius function from 1 to <code>n</code>.
 * @author Sean A. Irvine
 */
class Mertens extends AbstractFunction1 {

  @Override
  public long l(final long n) {
    if (n <= 0) {
      throw new IllegalArgumentException();
    }
    long mertens = 1;
    for (long k = 2; k <= n; ++k) {
      mertens += Functions.MOBIUS.i(k);
    }
    return mertens;
  }

  @Override
  public Z z(final long n) {
    return Z.valueOf(l(n));
  }
}
