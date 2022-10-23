package irvine.oeis.a000;

import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A000969 Expansion of (1+x+2*x^2)/((1-x)^2*(1-x^3)).
 * @author Sean A. Irvine
 */
public class A000969 extends Sequence0 {

  private Z mN = Z.NEG_ONE;

  @Override
  public Z next() {
    mN = mN.add(1);
    return mN.multiply2().add(3).multiply(mN.add(1)).divide(3);
  }
}
