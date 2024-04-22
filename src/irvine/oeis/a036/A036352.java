package irvine.oeis.a036;

import irvine.factor.prime.Fast;
import irvine.math.LongUtils;
import irvine.math.function.Functions;
import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A036352 Number of numbers up to 10^n that are products of two primes.
 * @author Sean A. Irvine
 */
public class A036352 extends Sequence1 {

  private final Fast mPrime = new Fast();
  private long mLimit = 1;

  @Override
  public Z next() {
    mLimit *= 10;
    final long sqrt = LongUtils.sqrt(mLimit);
    long sum = 0;
    for (long p = 2; p <= sqrt; p = mPrime.nextPrime(p)) {
      sum += Functions.PRIME_PI.l(mLimit / p);
    }
    return Z.valueOf(sum).subtract(Binomial.binomial(Functions.PRIME_PI.l(sqrt), 2));
  }
}
