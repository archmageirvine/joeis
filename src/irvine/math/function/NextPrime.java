package irvine.math.function;

import irvine.factor.prime.Puma;
import irvine.math.z.Z;

/**
 * Next prime function.
 * @author Sean A. Irvine
 */
class NextPrime extends AbstractFunction1 {

  @Override
  public Z z(final Z n) {
    return Puma.nextPrimeZ(n);
  }

  @Override
  public long l(final long n) {
    return Puma.nextPrime(n);
  }
}
