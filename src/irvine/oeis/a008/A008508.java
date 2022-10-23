package irvine.oeis.a008;

import irvine.factor.prime.Fast;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A008508 Number of odd primes less than n-th odd composite number.
 * @author Sean A. Irvine
 */
public class A008508 extends Sequence1 {

  private final Fast mPrime = new Fast();
  private Z mOddPrimes = Z.ZERO;
  private Z mN = Z.ONE;

  @Override
  public Z next() {
    while (true) {
      mN = mN.add(2);
      if (!mPrime.isPrime(mN)) {
        return mOddPrimes;
      }
      mOddPrimes = mOddPrimes.add(1);
    }
  }
}

