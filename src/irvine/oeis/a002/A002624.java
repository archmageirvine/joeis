package irvine.oeis.a002;

import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A002624 Expansion of (1-x)^(-3) * (1-x^2)^(-2).
 * @author Sean A. Irvine
 */
public class A002624 extends Sequence0 {

  private Z mN = Z.ZERO;

  @Override
  public Z next() {
    mN = mN.add(1);
    Z t = mN.add(10).multiply(mN).add(32).multiply(mN).add(32).multiply(mN);
    if (mN.isOdd()) {
      t = t.add(mN.multiply(6).add(15));
    }
    return t.divide(96);
  }
}
