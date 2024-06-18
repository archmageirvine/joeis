package irvine.math.function;

import irvine.math.z.Z;

/**
 * Parity.
 * @author Sean A. Irvine
 */
class Parity extends AbstractFunction1 {

  @Override
  public Z z(final Z n) {
    return n.and(Z.ONE);
  }

  @Override
  public long l(final long n) {
    return n & 1;
  }

  @Override
  public int i(final int n) {
    return n & 1;
  }
}
