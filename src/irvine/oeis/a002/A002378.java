package irvine.oeis.a002;

import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;
import irvine.oeis.DirectSequence;

/**
 * A002378 Oblong (or promic, pronic, or heteromecic) numbers: a(n) = n*(n+1).
 * @author Sean A. Irvine
 */
public class A002378 extends AbstractSequence implements DirectSequence {

  /**
   * Constructor with offset.
   * @param offset first index
   */
  protected A002378(final int offset) {
    super(offset);
  }

  /** Construct the sequence. */
  public A002378() {
    super(0);
  }

  protected Z mN = Z.ZERO;

  @Override
  public Z next() {
    final Z p = mN;
    mN = mN.add(1);
    return p.multiply(mN);
  }

  @Override
  public Z a(final Z n) {
    return n.multiply(n.add(1));
  }

  @Override
  public Z a(final int n) {
    return Z.valueOf(n).multiply(n + 1);
  }

}
