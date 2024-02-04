package irvine.oeis.a000;

import irvine.math.z.Z;
import irvine.oeis.DirectSequence;
import irvine.oeis.Sequence0;

/**
 * A000290 The squares: a(n) = n^2.
 * @author Sean A. Irvine
 */
public class A000290 extends Sequence0 implements DirectSequence {

  protected Z mN = Z.NEG_ONE;

  @Override
  public Z a(final Z n) {
    return n.square();
  }

  @Override
  public Z a(final int n) {
    return a(Z.valueOf(n));
  }

  @Override
  public Z next() {
    mN = mN.add(1);
    return mN.square();
  }
}
