package irvine.math.function;

import irvine.factor.factor.LeastPrimeFactorizer;
import irvine.math.z.Z;

/**
 * Compute the least prime divisor function.
 * @author Sean A. Irvine
 */
public class LeastPrimeFactor extends AbstractFunction1 {

  // Experience indicates a sieve (like GreatestPrimeFactor) is slower than this

  @Override
  public Z z(final Z n) {
    return LeastPrimeFactorizer.lpf(n);
  }
}
