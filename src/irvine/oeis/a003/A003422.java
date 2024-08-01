package irvine.oeis.a003;

import irvine.math.z.Z;
import irvine.oeis.DirectSequence;
import irvine.oeis.Sequence0;

/**
 * A003422 Left factorials: !n = Sum_{k=0..n-1} k!.
 * @author Sean A. Irvine
 */
public class A003422 extends Sequence0 implements DirectSequence {

  protected int mN = -2;
  private Z mF = Z.ONE;
  private Z mS = Z.ZERO;

  @Override
  public Z next() {
    if (++mN > 1) {
      mF = mF.multiply(mN);
    }
    if (mN >= 0) {
      mS = mS.add(mF);
    }
    return mS;
  }

  @Override
  public Z a(final Z n) {
    return a(n.intValueExact());
  }

  @Override
  public Z a(final int n) {
    Z sum = Z.ZERO;
    Z kf = Z.ONE;
    int k = 0;
    while (k < n) {
      sum = sum.add(kf);
      ++k;
      kf = kf.multiply(k);
    }
    return sum;
  }

}
