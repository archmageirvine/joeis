package irvine.oeis.a394;

import java.util.HashSet;

import irvine.factor.prime.Fast;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A397049.
 * @author Sean A. Irvine
 */
public class A394347 extends Sequence0 {

  private final Fast mPrime = new Fast();
  private final HashSet<Long> mUsed = new HashSet<>();
  private long mLeastUnusedPrime = 2;
  private long mN = -1;
  private long mMod = 10;

  private boolean is(long p, final long n, final long mod) {
    if (n == 0) {
      return p == 101;
    }
    while (p >= n) {
      if (p % mod == n) {
        return true;
      }
      p /= 10;
    }
    return false;
  }

  @Override
  public Z next() {
    if (++mN == mMod) {
      mMod *= 10;
    }
    while (mUsed.remove(mLeastUnusedPrime)) {
      mLeastUnusedPrime = mPrime.nextPrime(mLeastUnusedPrime);
    }
    long p = mLeastUnusedPrime;
    while (true) {
      if (!mUsed.contains(p) && is(p, mN, mMod)) {
        mUsed.add(p);
        return Z.valueOf(p);
      }
      p = mPrime.nextPrime(p);
    }
  }
}
