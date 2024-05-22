package irvine.math.function;

import irvine.math.z.Z;

/**
 * Jacobsthal function.
 * @author Sean A. Irvine
 */
class Jacobsthal extends AbstractFunction1 {

  @Override
  public Z z(final long n) {
    return Z.ONE.shiftLeft(n).subtract((n & 1) == 1 ? Z.NEG_ONE : Z.ONE).divide(3);
  }
}
