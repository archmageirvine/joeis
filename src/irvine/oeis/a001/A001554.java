package irvine.oeis.a001;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A001554 1^n + 2^n + ... + 7^n.
 * @author Sean A. Irvine
 */
public class A001554 implements Sequence {

  private Z mTwo = null;
  private Z mThree = Z.ONE;
  private Z mFour = Z.ONE;
  private Z mFive = Z.ONE;
  private Z mSix = Z.ONE;
  private Z mSeven = Z.ONE;

  @Override
  public Z next() {
    if (mTwo == null) {
      mTwo = Z.ONE;
    } else {
      mTwo = mTwo.multiply2();
      mThree = mThree.multiply(3);
      mFour = mFour.shiftLeft(2);
      mFive = mFive.multiply(5);
      mSix = mSix.multiply(6);
      mSeven = mSeven.multiply(7);
    }
    return mSeven.add(mSix).add(mFive).add(mFour).add(mThree).add(mTwo).add(1);
  }
}
