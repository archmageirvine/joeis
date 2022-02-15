package irvine.oeis.a054;

import irvine.math.z.Z;
import irvine.oeis.a002.A002720;

/**
 * A054647.
 * @author Sean A. Irvine
 */
public class A054652 extends A002720 {

  private Z mF = Z.ONE;

  @Override
  public Z next() {
    final Z t = super.next();
    if (mN.signum() > 0) {
      mF = mF.multiply(mN);
    }
    return t.multiply(mF);
  }
}
