package irvine.oeis.a001;

import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;

/**
 * A001550 a(n) = 1^n + 2^n + 3^n.
 * @author Sean A. Irvine
 */
public class A001550 extends AbstractSequence {

  /**
   * Constructor with offset.
   * @param offset first index
   */
  protected A001550(final int offset) {
    super(offset);
  }

  /** Construct the sequence. */
  public A001550() {
    super(0);
  }

  private Z mTwo = null;
  private Z mThree = Z.ONE;

  @Override
  public Z next() {
    if (mTwo == null) {
      mTwo = Z.ONE;
    } else {
      mTwo = mTwo.multiply2();
      mThree = mThree.multiply(3);
    }
    return mThree.add(mTwo).add(1);
  }
}
