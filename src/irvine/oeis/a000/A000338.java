package irvine.oeis.a000;

import irvine.math.z.Z;
import irvine.oeis.Sequence3;

/**
 * A000338 Expansion of x^3*(5-2*x)*(1-x^3)/(1-x)^4.
 * @author Sean A. Irvine
 */
public class A000338 extends Sequence3 {

  private Z mN = null;

  @Override
  public Z next() {
    if (mN == null) {
      mN = Z.TWO;
      return Z.FIVE;
    }
    mN = mN.add(1);
    return mN.square().multiply(9).subtract(mN.multiply(15)).divide2();
  }
}

