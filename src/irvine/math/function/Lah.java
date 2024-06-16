package irvine.math.function;

import irvine.math.z.Binomial;
import irvine.math.z.Z;

/**
 * Lah numbers.
 * @author Sean A. Irvine
 */
class Lah extends AbstractFunction2 {

  @Override
  public Z z(final long n, final long m) {
    final Z t = Binomial.binomial(n - 1, m - 1).multiply(Functions.FACTORIAL.z(n)).divide(Functions.FACTORIAL.z(m));
    return (n & 1) == 0 ? t : t.negate();
  }
}
