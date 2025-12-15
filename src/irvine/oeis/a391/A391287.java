package irvine.oeis.a391;

import irvine.factor.prime.Fast;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A391287 a(n) is the number of twin prime pairs entirely within the sets of length prime(n) that are incrementally taken from the sequence of odd consecutive primes.
 * @author Sean A. Irvine
 */
public class A391287 extends Sequence1 {

  private final Fast mPrime = new Fast();
  private long mP = 1;
  private long mQ = 2;

  @Override
  public Z next() {
    mP = mPrime.nextPrime(mP);
    long cnt = 0;
    for (long k = 1; k < mP; ++k) {
      mQ = mPrime.nextPrime(mQ);
      if (mPrime.isPrime(mQ + 2)) {
        ++cnt;
      }
    }
    mQ = mPrime.nextPrime(mQ); // last prime of interval, can never be part of contained pair
    return Z.valueOf(cnt);
  }
}
