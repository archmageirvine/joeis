package irvine.oeis.a178;

import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A178465 Expansion of -2*x^2*(-3-2*x+x^2-x^3-2*x^4+x^5)  /  ( (1+x)^2*(x-1)^4 ).
 * @author Sean A. Irvine
 */
public class A178465 extends Sequence0 {

  private Z mN = Z.NEG_ONE;

  @Override
  public Z next() {
    mN = mN.add(1);
    if (mN.isEven()) {
      return mN.square().add(2).multiply(mN).divide2();
    } else if (Z.ONE.equals(mN)) {
      return Z.ZERO;
    } else {
      return mN.square().subtract(mN).add(2).multiply(mN.add(1)).divide2();
    }
  }
}
