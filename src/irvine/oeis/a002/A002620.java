package irvine.oeis.a002;

import irvine.math.z.Z;
import irvine.oeis.DirectSequence;
import irvine.oeis.Sequence0;

/**
 * A002620 Quarter-squares: a(n) = floor(n/2)*ceiling(n/2). Equivalently, a(n) = floor(n^2/4).
 * @author Sean A. Irvine
 */
public class A002620 extends Sequence0 implements DirectSequence {

  private Z mN = Z.NEG_ONE;

  @Override
  public Z next() {
    mN = mN.add(1);
    return mN.square().divide(4);
  }

  @Override
  public Z a(final Z n) {
    return n.square().divide(4);
  }

  @Override
  public Z a(final int n) {
    return Z.valueOf(n).multiply(n).divide(4);
  }

}
