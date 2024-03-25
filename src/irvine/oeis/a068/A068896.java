package irvine.oeis.a068;

import irvine.factor.prime.Fast;
import irvine.math.z.Z;
import irvine.math.z.ZUtils;
import irvine.oeis.Sequence1;

/**
 * A068896 Primes containing 2k digits in which the sum of the first k digits is that of the last k digits.
 * @author Sean A. Irvine
 */
public class A068896 extends Sequence1 {

  private final Fast mPrime = new Fast();
  private long mMod = 10;
  private long mLim = 100;
  private long mP = 10;

  @Override
  public Z next() {
    while (true) {
      mP = mPrime.nextPrime(mP);
      if (mP >= mLim) {
        mP = mPrime.nextPrime(mLim * 10);
        mLim *= 100;
        mMod *= 10;
      }
      if (ZUtils.digitSum(mP % mMod) == ZUtils.digitSum(mP / mMod)) {
        return Z.valueOf(mP);
      }
    }
  }
}
