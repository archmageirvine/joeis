package irvine.oeis.a005;

import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;
import irvine.oeis.DirectSequence;

/**
 * A005408 The odd numbers: a(n) = 2*n + 1.
 * @author Sean A. Irvine
 */
public class A005408 extends AbstractSequence implements DirectSequence {

  /**
   * Constructor with offset.
   * @param offset first index
   */
  protected A005408(final int offset) {
    super(offset);
  }

  /** Construct the sequence. */
  public A005408() {
    super(0);
  }

  private Z mN = Z.NEG_ONE;

  @Override
  public Z next() {
    mN = mN.add(2);
    return mN;
  }

  @Override
  public Z a(final Z n) {
    return n.multiply(2).add(1);
  }

  @Override
  public Z a(final int n) {
    return Z.valueOf(n * 2 + 1);
  }

}
