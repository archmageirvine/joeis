package irvine.oeis.a000;

import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;

/**
 * A000215 Fermat numbers: a(n) = 2^(2^n) + 1.
 * @author Sean A. Irvine
 */
public class A000215 extends AbstractSequence {

  /**
   * Constructor with offset.
   * @param offset first index
   */
  protected A000215(final int offset) {
    super(offset);
  }

  /** Construct the sequence. */
  public A000215() {
    super(0);
  }

  private int mN = 0;

  @Override
  public Z next() {
    if (mN == 0) {
      mN = 1;
    } else {
      mN <<= 1;
      if (mN < 0) {
        throw new UnsupportedOperationException();
      }
    }
    return Z.ONE.shiftLeft(mN).add(1);
  }
}
