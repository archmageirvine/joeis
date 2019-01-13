package irvine.oeis.a005;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A005802.
 * @author Sean A. Irvine
 */
public class A005802 implements Sequence {

  private Z mA = null;
  private Z mB = null;
  private Z mN = Z.NEG_ONE;

  @Override
  public Z next() {
    if (mB == null) {
      if (mA == null) {
        mA = Z.ONE;
      } else {
        mB = Z.ONE;
      }
      return Z.ONE;
    }
    mN = mN.add(1);
    final Z t = mB.multiply(mN.multiply(10).add(42).multiply(mN).add(41))
      .subtract(mA.multiply(mN.multiply(9).add(18).multiply(mN).add(9)))
      .divide(mN.add(8).multiply(mN).add(16));
    mA = mB;
    mB = t;
    return t;
  }
}
