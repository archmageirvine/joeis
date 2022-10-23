package irvine.oeis.a007;

import irvine.factor.prime.Fast;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A007350 Where the prime race 4k-1 vs. 4k+1 changes leader.
 * @author Sean A. Irvine
 */
public class A007350 extends Sequence1 {

  private Z mP = Z.TWO;
  private final Fast mPrime = new Fast();
  private long mPlus = 0;
  private boolean mSide = true; // start on plus side

  @Override
  public Z next() {
    while (true) {
      mP = mPrime.nextPrime(mP);
      mPlus += 2 - mP.mod(4);
      if ((mSide && mPlus < 0) || (!mSide && mPlus > 0)) {
        mSide = !mSide;
        return mP;
      }
    }
  }
}
