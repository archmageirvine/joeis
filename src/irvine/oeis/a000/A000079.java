package irvine.oeis.a000;

import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;

/**
 * A000079 Powers of 2: a(n) = 2^n.
 * @author Sean A. Irvine
 */
public class A000079 extends AbstractSequence {

  /**
   * Constructor with offset.
   * @param offset first index
   */
  protected A000079(final int offset) {
    super(offset);
  }

  /** Construct the sequence. */
  public A000079() {
    super(0);
  }

  private Z mN = null;

  @Override
  public Z next() {
    if (mN == null) {
      mN = Z.ONE;
    } else {
      mN = mN.multiply2();
    }
    return mN;
  }
}
