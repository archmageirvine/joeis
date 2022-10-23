package irvine.oeis.a007;

import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A007980 Expansion of (1+x^2)/((1-x)^2*(1-x^3)).
 * @author Sean A. Irvine
 */
public class A007980 extends Sequence0 {

  private Z mN = Z.ZERO;

  @Override
  public Z next() {
    mN = mN.add(1);
    return mN.multiply(mN.add(1)).add(2).divide(3);
  }
}
