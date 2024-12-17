package irvine.oeis.a073;

import irvine.factor.prime.Fast;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A073700 a(1) = 1, a(n) = Floor[(Sum of composite numbers up to n)/(Sum of primes up to n)].
 * @author Sean A. Irvine
 */
public class A073700 extends Sequence1 {

  private final Fast mPrime = new Fast();
  private Z mSumPrimes = Z.ZERO;
  private Z mSumComposites = Z.ZERO;
  private long mN = 0;

  @Override
  public Z next() {
    if (++mN == 1) {
      return Z.ONE;
    }
    if (mPrime.isPrime(mN)) {
      mSumPrimes = mSumPrimes.add(mN);
    } else {
      mSumComposites = mSumComposites.add(mN);
    }
    return mSumComposites.divide(mSumPrimes);
  }
}
