package irvine.oeis.a023;

import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;

/**
 * A023416 Number of 0's in binary expansion of n.
 * @author Sean A. Irvine
 */
public class A023416 extends AbstractSequence {

  /**
   * Constructor with offset.
   * @param offset first index
   */
  protected A023416(final int offset) {
    super(offset);
  }

  /** Construct the sequence. */
  public A023416() {
    super(0);
  }

  private Z mN = Z.NEG_ONE;

  @Override
  public Z next() {
    mN = mN.add(1);
    return mN.isZero() ? Z.ONE : Z.valueOf(mN.bitLength() - mN.bitCount());
  }
}
