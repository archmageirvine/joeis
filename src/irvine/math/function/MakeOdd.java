package irvine.math.function;

import irvine.math.z.Z;

/**
 * Make odd (remove any powers of 2 from a number).
 * @author Sean A. Irvine
 */
class MakeOdd extends AbstractFunction1 {

  @Override
  public Z z(final Z n) {
    return n.makeOdd();
  }

  @Override
  public Z z(final long n) {
    return Z.valueOf(l(n));
  }

  @Override
  public Z z(final int n) {
    return Z.valueOf(i(n));
  }

  @Override
  public long l(long n) {
    if (n == 0) {
      return 0;
    }
    while ((n & 1) == 0) {
      n >>= 1;
    }
    return n;
  }

  @Override
  public int i(int n) {
    if (n == 0) {
      return 0;
    }
    while ((n & 1) == 0) {
      n >>= 1;
    }
    return n;
  }
}
