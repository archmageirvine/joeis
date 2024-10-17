package irvine.oeis.a008;

import irvine.math.z.Z;
import irvine.oeis.DirectSequence;
import irvine.oeis.Sequence0;

/**
 * A008615 a(n) = floor(n/2) - floor(n/3).
 * @author Sean A. Irvine
 */
public class A008615 extends Sequence0 implements DirectSequence {

  private Z mN = Z.NEG_ONE;

  @Override
  public Z next() {
    mN = mN.add(1);
    return mN.divide2().subtract(mN.divide(3));
  }

  @Override
  public Z a(final Z n) {
    return n.divide2().subtract(n.divide(3));
  }

  @Override
  public Z a(final int n) {
    return Z.valueOf((n >> 1) - n / 3);
  }

}

