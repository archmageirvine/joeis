package irvine.math.function;

import irvine.math.z.Z;

/**
 * Hexagonal numbers.
 * @author Sean A. Irvine
 */
class Hexagonal extends AbstractFunction1 {

  @Override
  public Z z(final Z n) {
    return n.multiply(n.multiply2().subtract(1));
  }

  @Override
  public Z z(final long n) {
    return Z.valueOf(n).multiply(2L * n - 1);
  }
}
