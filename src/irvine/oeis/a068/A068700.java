package irvine.oeis.a068;

import irvine.factor.prime.Fast;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A068700 The concatenation of n with n-1 and n with n+1 both yield primes (twin primes).
 * @author Sean A. Irvine
 */
public class A068700 extends Sequence1 {

  private final Fast mPrime = new Fast();
  private long mN = 40;
  private long mLim = 100;

  @Override
  public Z next() {
    while (true) {
      mN += 2;
      if (mN >= mLim) {
        mLim *= 10;
      }
      final long t = mN * mLim;
      if (mPrime.isPrime(t + mN + 1) && mPrime.isPrime(t + mN - 1)) {
        return Z.valueOf(mN);
      }
    }
  }
}
