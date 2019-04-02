package irvine.oeis.a002;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A002458 a(n) = binomial(4n+1, 2n).
 * @author Sean A. Irvine
 */
public class A002458 implements Sequence {

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
