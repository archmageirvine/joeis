package irvine.oeis.a000;

import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;

/**
 * A000866 2^n written in base 5.
 * @author Sean A. Irvine
 */
public class A000866 extends AbstractSequence {

  /**
   * Constructor with offset.
   * @param offset first index
   */
  protected A000866(final int offset) {
    super(offset);
  }

  /** Construct the sequence. */
  public A000866() {
    super(0);
  }

  private Z mN = null;

  @Override
  public Z next() {
    mN = mN == null ? Z.ONE : mN.multiply2();
    return new Z(mN.toString(5));
  }
}
