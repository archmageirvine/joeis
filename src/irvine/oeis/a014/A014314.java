package irvine.oeis.a014;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A014314 Number of up steps in all length n left factors of Dyck paths.
 * @author Sean A. Irvine
 */
public class A014314 implements Sequence {

  private Z mA = Z.ZERO;
  private Z mB = Z.ONE;
  private Z mC = Z.THREE;
  private long mN = -1;

  @Override
  public Z next() {
    if (++mN <= 2) {
      return mN == 0 ? mA : (mN == 1 ? mB : mC);
    }
    final Z n = Z.valueOf(mN);
    final Z t = mC.multiply(n.subtract(1).multiply(mN).subtract(10).multiply(mN).subtract(2)).multiply2()
      .add(mB.multiply(n.subtract(2).multiply(mN).subtract(1).multiply(mN).add(8)).shiftLeft(2))
      .subtract(mA.multiply(n.square().subtract(5)).multiply(mN - 2).shiftLeft(3))
      .divide(mN + 1).divide(n.subtract(2).multiply(mN).subtract(4));
    mA = mB;
    mB = mC;
    mC = t;
    return t;
  }
}

