package irvine.oeis.a006;

import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;
import irvine.oeis.DirectSequence;

/**
 * A006519 Highest power of 2 dividing n.
 * @author Sean A. Irvine
 */
public class A006519 extends AbstractSequence implements DirectSequence {

  /**
   * Constructor with offset.
   * @param offset first index
   */
  protected A006519(final int offset) {
    super(offset);
  }

  /** Construct the sequence. */
  public A006519() {
    super(1);
  }

  private Z mN = Z.ZERO;

  @Override
  public Z next() {
    mN = mN.add(1);
    return a(mN);
  }

  @Override
  public Z a(final Z n) {
    n.makeOdd();
    return Z.ONE.shiftLeft(mN.auxiliary());
  }

  @Override
  public Z a(final int n) {
    return Z.ONE.shiftLeft(Integer.numberOfTrailingZeros(n));
  }
}
