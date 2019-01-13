package irvine.oeis.a001;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A001118.
 * @author Sean A. Irvine
 */
public class A001118 implements Sequence {

  private Z mFive = Z.ONE;
  private Z mFour = Z.FIVE;
  private Z mThree = Z.TEN;
  private Z mTwo = Z.TEN;
  private boolean mDoneFirst = false;

  @Override
  public Z next() {
    if (mDoneFirst) {
      mFive = mFive.multiply(5);
      mFour = mFour.shiftLeft(2);
      mThree = mThree.multiply(3);
      mTwo = mTwo.multiply2();
    } else {
      mDoneFirst = true;
    }
    return mFive.subtract(mFour).add(mThree).subtract(mTwo).add(5);
  }
}

