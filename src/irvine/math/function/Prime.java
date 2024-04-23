package irvine.math.function;

import irvine.factor.prime.Puma;
import irvine.math.z.Z;

/**
 * Nth prime function.
 * @author Sean A. Irvine
 */
class Prime extends AbstractFunction1 {

  @Override
  public Z z(final long n) {
    return Puma.primeZ(n);
  }

  @Override
  public long l(final long n) {
    return Puma.prime(n);
  }
}
