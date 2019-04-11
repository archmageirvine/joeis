package irvine.oeis.a007;

import irvine.factor.prime.Fast;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A007350 Where prime race <code>4n-1</code> vs. <code>4n+1</code> changes leader.
 * @author Sean A. Irvine
 */
public class A007350 implements Sequence {

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
