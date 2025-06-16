package irvine.oeis.a117;

import irvine.factor.prime.Fast;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A117929 Number of partitions of n into 2 distinct primes.
 * @author Sean A. Irvine
 */
public class A117929 extends Sequence1 {

  private final Fast mPrime = new Fast();
  private long mN = 0;

  @Override
  public Z next() {
    if ((++mN & 1) == 1) {
      // n is odd, only possible if n - 2 is prime
      return mPrime.isPrime(mN - 2) ? Z.ONE : Z.ZERO;
    }
    long cnt = 0;
    for (long p = 2; 2 * p < mN; p = mPrime.nextPrime(p)) {
      if (mPrime.isPrime(mN - p)) {
        ++cnt;
      }
    }
    return Z.valueOf(cnt);
  }
}

