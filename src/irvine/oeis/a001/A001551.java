package irvine.oeis.a001;

import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;

/**
 * A001551 a(n) = 1^n + 2^n + 3^n + 4^n.
 * @author Sean A. Irvine
 */
public class A001551 extends AbstractSequence {

  /**
   * Constructor with offset.
   * @param offset first index
   */
  protected A001551(final int offset) {
    super(offset);
  }

  /** Construct the sequence. */
  public A001551() {
    super(0);
  }

  private Z mTwo = null;
  private Z mThree = Z.ONE;
  private Z mFour = Z.ONE;

  @Override
  public Z next() {
    if (mTwo == null) {
      mTwo = Z.ONE;
    } else {
      mTwo = mTwo.multiply2();
      mThree = mThree.multiply(3);
      mFour = mFour.shiftLeft(2);
    }
    return mFour.add(mThree).add(mTwo).add(1);
  }
}
