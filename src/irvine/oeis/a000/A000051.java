package irvine.oeis.a000;

import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;
import irvine.oeis.DirectSequence;

/**
 * A000051 a(n) = 2^n + 1.
 * @author Sean A. Irvine
 */
public class A000051 extends AbstractSequence implements DirectSequence {

  /**
   * Constructor with offset.
   * @param offset first index
   */
  protected A000051(final int offset) {
    super(offset);
  }

  /** Construct the sequence. */
  public A000051() {
    super(0);
  }

  private Z mN = Z.ONE;

  @Override
  public Z next() {
    final Z r = mN.add(1);
    mN = mN.multiply2();
    return r;
  }

  @Override
  public Z a(final Z n) {
    return Z.TWO.pow(n).add(1);
  }

  @Override
  public Z a(final int n) {
    return Z.ONE.shiftLeft(n).add(1);
  }

}

