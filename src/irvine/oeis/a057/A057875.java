package irvine.oeis.a057;

import irvine.factor.prime.Fast;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A057875 Numbers of 2n-digit primes which are concatenations of n-digit primes (no leading zeros allowed).
 * @author Sean A. Irvine
 */
public class A057875 implements Sequence {

  private final Fast mPrime = new Fast();
  private long mLim = 1;
  private long mMod = 1;

  @Override
  public Z next() {
    long cnt = 0;
    final long min = mMod;
    long p = mPrime.nextPrime(mLim * 10);
    mLim *= 100;
    mMod *= 10;
    while (p < mLim) {
      final long q = p % mMod;
      if (q > min && mPrime.isPrime(q)) {
        final long r = p / mMod;
        if (mPrime.isPrime(r)) {
          ++cnt;
        }
      }
      p = mPrime.nextPrime(p);
    }
    return Z.valueOf(cnt);
  }
}

