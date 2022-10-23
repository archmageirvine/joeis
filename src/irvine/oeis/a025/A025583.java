package irvine.oeis.a025;

import irvine.factor.prime.Fast;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A025583 Composite numbers that are not the sum of 2 primes.
 * @author Sean A. Irvine
 */
public class A025583 extends Sequence1 {

  private final Fast mPrime = new Fast();
  private long mN = 25;

  private boolean isSumOfTwoPrimes(final long n) {
    for (long p = 2; p < n / 2; p = mPrime.nextPrime(p)) {
      if (mPrime.isPrime(n - p)) {
        return true;
      }
    }
    return false;
  }

  @Override
  public Z next() {
    while (true) {
      mN += 2;
      if (!mPrime.isPrime(mN) && !isSumOfTwoPrimes(mN)) {
        return Z.valueOf(mN);
      }
    }
  }
}
