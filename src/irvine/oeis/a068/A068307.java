package irvine.oeis.a068;

import irvine.factor.prime.Fast;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A068307 From Goldbach problem: number of decompositions of n into a sum of three primes.
 * @author Sean A. Irvine
 */
public class A068307 extends Sequence1 {

  private final Fast mPrime = new Fast();
  private long mN = 0;

  @Override
  public Z next() {
    ++mN;
    long cnt = 0;
    for (long p = mPrime.nextPrime((mN + 2) / 3 - 1); p < mN - 3; p = mPrime.nextPrime(p)) {
      for (long q = mPrime.nextPrime((mN - p + 1) / 2 - 1); q <= Math.min(mN - p - 2, p); q = mPrime.nextPrime(q)) {
        if (mPrime.isPrime(mN - p - q)) {
          ++cnt;
        }
      }
    }
    return Z.valueOf(cnt);
  }
}
