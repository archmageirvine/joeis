package irvine.oeis.a062;

import irvine.math.z.Z;
import irvine.oeis.a000.A000040;

/**
 * A062836 Floor[ Sum_{k=1..n,p(k)^2} / Sum_{k=1..n,p(k)-1} ].
 * @author Sean A. Irvine
 */
public class A062836 extends A000040 {

  private Z mNum = Z.ZERO;
  private Z mDen = Z.ZERO;

  @Override
  public Z next() {
    final Z p = super.next();
    mNum = mNum.add(p.square());
    mDen = mDen.add(p.subtract(1));
    return mNum.divide(mDen);
  }
}
