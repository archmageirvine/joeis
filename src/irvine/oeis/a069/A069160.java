package irvine.oeis.a069;

import irvine.factor.prime.Fast;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A069160 Number of primes p such that n^2 &lt; p &lt; n^2 + pi(n), where pi(n) is the number of primes less than n.
 * @author Sean A. Irvine
 */
public class A069160 extends Sequence1 {

  private final Fast mPrime = new Fast();
  private long mN = 0;
  private long mPi = 0;

  @Override
  public Z next() {
    if (mPrime.isPrime(++mN)) {
      ++mPi;
    }
    long cnt = 0;
    for (long p = mPrime.nextPrime(mN * mN); p < mN * mN + mPi; p = mPrime.nextPrime(p)) {
      ++cnt;
    }
    return Z.valueOf(cnt);
  }
}

