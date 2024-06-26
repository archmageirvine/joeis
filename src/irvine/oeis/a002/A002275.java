package irvine.oeis.a002;

import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;
import irvine.oeis.DirectSequence;

/**
 * A002275 Repunits: (10^n - 1)/9. Often denoted by R_n.
 * @author Sean A. Irvine
 */
public class A002275 extends AbstractSequence implements DirectSequence {

  /**
   * Constructor with offset.
   * @param offset first index
   */
  protected A002275(final int offset) {
    super(offset);
  }

  /** Construct the sequence. */
  public A002275() {
    super(0);
  }

  private Z mN = null;

  protected long unit() {
    return 1;
  }

  @Override
  public Z next() {
    if (mN == null) {
      mN = Z.ZERO;
    } else {
      mN = mN.multiply(10).add(unit());
    }
    return mN;
  }

  @Override
  public Z a(final Z n) {
    return Z.TEN.pow(n).subtract(1).divide(9);
  }

  @Override
  public Z a(final int n) {
    return Z.TEN.pow(n).subtract(1).divide(9);
  }

}
