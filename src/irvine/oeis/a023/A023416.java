package irvine.oeis.a023;

import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;
import irvine.oeis.DirectSequence;

/**
 * A023416 Number of 0's in binary expansion of n.
 * @author Sean A. Irvine
 */
public class A023416 extends AbstractSequence implements DirectSequence {

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
    return a(mN);
  }

  @Override
  public Z a(final Z n) {
    return n.isZero() ? Z.ONE : Z.valueOf(n.bitLength() - n.bitCount());
  }

  @Override
  public Z a(final int n) {
    return a(Z.valueOf(n));
  }

}
