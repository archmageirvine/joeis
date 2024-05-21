package irvine.math.function;

import irvine.factor.factor.Jaguar;
import irvine.math.z.Z;

/**
 * Dedekind psi function.
 * @author Sean A. Irvine
 */
class DedekindPsi extends AbstractFunction1 {

  @Override
  public Z z(final Z n) {
    Z prod = n;
    for (final Z p : Jaguar.factor(n).toZArray()) {
      prod = prod.divide(p).multiply(p.add(1));
    }
    return prod;
  }
}
