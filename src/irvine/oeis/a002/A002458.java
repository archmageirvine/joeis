package irvine.oeis.a002;

import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A002458 a(n) = binomial(4*n+1, 2*n).
 * @author Sean A. Irvine
 */
public class A002458 extends Sequence0 {

  private Z mN = Z.NEG_ONE;
  private Z mA = Z.ONE;

  @Override
  public Z next() {
    mN = mN.add(1);
    if (mN.signum() > 0) {
      mA = mA.multiply(mN.square().multiply(16).subtract(1).multiply2()).divide(mN).divide(mN.multiply2().add(1));
    }
    return mA;
  }
}
