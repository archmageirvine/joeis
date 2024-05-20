package irvine.math.function;

import irvine.math.z.Z;

/**
 * Square pyramidal numbers.
 * @author Sean A. Irvine
 */
class Pyramidal extends AbstractFunction1 {

  @Override
  public Z z(final Z n) {
    return n.multiply(n.add(1)).multiply(n.multiply2().add(1)).divide(6);
  }

  @Override
  public Z z(final long n) {
    return Z.valueOf(n).multiply(n + 1).multiply(2L * n + 1).divide(6);
  }
}
