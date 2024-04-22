package irvine.math.function;

import irvine.math.z.Binomial;
import irvine.math.z.Z;

/**
 * Catalan function.
 * @author Sean A. Irvine
 */
class Catalan extends AbstractFunction1 {

  @Override
  public Z z(final long n) {
    return Binomial.binomial(2 * n, n).divide(n + 1);
  }
}
