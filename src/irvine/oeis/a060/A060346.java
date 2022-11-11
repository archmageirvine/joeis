package irvine.oeis.a060;

import irvine.math.q.Q;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A060346 Numerators of sequence arising from study of Calabi-Yau manifolds.
 * @author Sean A. Irvine
 */
public class A060346 extends Sequence0 {

  private int mN = 3;
  private Q mA = null;
  private Q mB = null;
  private Q mC = null;
  private Q mD = null;

  protected Z select(final Q n) {
    return n.num();
  }

  @Override
  public Z next() {
    if (mD == null) {
      if (mA == null) {
        mA = new Q(-1, 5);
        return select(mA);
      }
      if (mB == null) {
        mB = new Q(-3, 50);
        return select(mB);
      }
      if (mC == null) {
        mC = new Q(-11, 375);
        return select(mC);
      }
      mD = new Q(-217, 12500);
      return select(mD);
    }
    final Z n = Z.valueOf(++mN);
    final Q t1 = mD.multiply(20L * mN * mN - 40L * mN + 23).multiply(mN - 1).multiply(mN).multiply(125)
      .subtract(mC.multiply(n.multiply(30).subtract(150).multiply(mN).add(261).multiply(mN).subtract(157)).multiply(mN - 1).multiply(125))
      .add(mB.multiply(n.multiply(2500).subtract(22500).multiply(mN).add(76625).multiply(mN).subtract(116875).multiply(mN).add(67226)))
      .subtract(mA.multiply(Z.valueOf(mN - 3).pow(4)).multiply(625));
    mA = mB;
    mB = mC;
    mC = mD;
    mD = t1.divide(n.square().multiply(n.square().subtract(1)).multiply(625));
    return select(mD);
  }
}
