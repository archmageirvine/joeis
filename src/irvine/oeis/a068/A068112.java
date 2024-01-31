package irvine.oeis.a068;

import irvine.math.q.Q;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A068112 Denominator of coefficient of (-x^2)^n in F(x)*F(-x) where F(x)=sum(k&gt;=0,x^k/(k!)^3).
 * @author Sean A. Irvine
 */
public class A068112 extends Sequence0 {

  private long mN = -1;
  private Z mDen = Z.ONE;
  private Z mNum = Z.ONE;

  protected Z select(final Q n) {
    return n.den();
  }

  @Override
  public Z next() {
    if (++mN >= 1) {
      mDen = mDen.multiply(Z.valueOf(mN).multiply(2 * mN).multiply(2 * mN - 1).pow(3));
      mNum = mNum.multiply(3 * mN).multiply(3 * mN - 1).multiply(3 * mN - 2);
    }
    return select(new Q(mNum, mDen));
  }
}
