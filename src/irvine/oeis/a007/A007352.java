package irvine.oeis.a007;

import irvine.factor.prime.Fast;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A007352 Where the prime race 3k-1 vs. 3k+1 changes leader.
 * @author Sean A. Irvine
 */
public class A007352 extends Sequence1 {

  private Z mP = null;
  private final Fast mPrime = new Fast();
  private long mPlus = 0;
  private boolean mSide = false;

  @Override
  public Z next() {
    if (mP == null) {
      mP = Z.valueOf(608981813028L); // skip past big initial gap
      return Z.TWO;
    }
    while (true) {
      mP = mPrime.nextPrime(mP);
      mPlus += mP.mod(3) == 1 ? 1 : -1;
      if ((mSide && mPlus < 0) || (!mSide && mPlus > 0)) {
        mSide = !mSide;
        return mP;
      }
    }
  }
}
