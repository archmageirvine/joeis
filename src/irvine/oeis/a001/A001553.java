package irvine.oeis.a001;

import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;

/**
 * A001553 a(n) = 1^n + 2^n + ... + 6^n.
 * @author Sean A. Irvine
 */
public class A001553 extends AbstractSequence {

  /**
   * Constructor with offset.
   * @param offset first index
   */
  protected A001553(final int offset) {
    super(offset);
  }

  /** Construct the sequence. */
  public A001553() {
    super(0);
  }

  private Z mTwo = null;
  private Z mThree = Z.ONE;
  private Z mFour = Z.ONE;
  private Z mFive = Z.ONE;
  private Z mSix = Z.ONE;

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
    }
    return mSix.add(mFive).add(mFour).add(mThree).add(mTwo).add(1);
  }
}
