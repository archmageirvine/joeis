package irvine.math.function;

import irvine.factor.prime.Puma;
import irvine.math.z.Z;

/**
 * Previous prime function.
 * @author Sean A. Irvine
 */
class PrevPrime extends AbstractFunction1 {

  @Override
  public Z z(final Z n) {
    return Puma.prevPrimeZ(n);
  }

  @Override
  public long l(final long n) {
    return Puma.prevPrime(n);
  }
}
