package irvine.oeis.a074;

import irvine.factor.factor.Jaguar;
import irvine.factor.prime.Fast;
import irvine.factor.util.FactorSequence;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A074210 Numbers k such that the number of primes &lt;= k is equal to the sum of primes from the smallest prime factor of k to the largest prime factor of k.
 * @author Sean A. Irvine
 */
public class A074210 extends Sequence1 {

  private final Fast mPrime = new Fast();
  private long mN = 0;
  private long mPrimePi = 0;

  @Override
  public Z next() {
    if (mN == 0) {
      ++mN;
      return Z.ONE;
    }
    while (true) {
      if (mPrime.isPrime(++mN)) {
        ++mPrimePi;
      }
      final FactorSequence fs = Jaguar.factor(mN);
      long sum = 0;
      for (long p = fs.leastPrimeFactor().longValue(); p <= fs.largestPrimeFactor().longValue(); p = mPrime.nextPrime(p)) {
        sum += p;
      }
      if (sum == mPrimePi) {
        return Z.valueOf(mN);
      }
    }
  }
}
