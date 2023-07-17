package irvine.oeis.a056;

import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;

/**
 * A056525 Palindromes with odd number of digits.
 * @author Sean A. Irvine
 */
public class A056525 extends AbstractSequence {

  /**
   * Constructor with offset.
   * @param offset first index
   */
  protected A056525(final int offset) {
    super(offset);
  }

  /** Construct the sequence. */
  public A056525() {
    super(1);
  }

  private String mForward = "";
  private StringBuilder mReverse = new StringBuilder();
  private long mN = 0;
  private int mM = 0;

  @Override
  public Z next() {
    if (++mM > 9) {
      mForward = String.valueOf(++mN);
      mReverse = new StringBuilder(mForward).reverse();
      mM = 0;
    }
    return new Z(mForward + mM + mReverse);
  }
}
