package irvine.oeis.a005;

import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;

/**
 * A005843 The nonnegative even numbers: a(n) = 2n.
 * @author Sean A. Irvine
 */
public class A005843 extends AbstractSequence {

  /**
   * Constructor with offset.
   * @param offset first index
   */
  protected A005843(final int offset) {
    super(offset);
  }

  /** Construct the sequence. */
  public A005843() {
    super(0);
  }

  private Z mN = Z.valueOf(-2);

  @Override
  public Z next() {
    mN = mN.add(2);
    return mN;
  }
}
