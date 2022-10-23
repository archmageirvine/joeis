package irvine.oeis.a003;

import irvine.math.q.Q;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A003303 Numerators of spin-wave coefficients for cubic lattice.
 * @author Sean A. Irvine
 */
public class A003303 extends Sequence0 {

  private Q mA = Q.ZERO;
  private Q mB = Q.ZERO;
  private Q mC = Q.ONE;
  private long mN = -2;

  @Override
  public Z next() {
    if (++mN >= 0) {
      final Z n = Z.valueOf(mN);
      final Q t = mC.multiply(n.multiply(22).add(22).multiply(mN).add(9)).multiply(32)
        .subtract(mB.multiply(n.square().multiply(4).add(1).multiply(mN).multiply(144)))
        .add(mA.multiply(Z.valueOf(2 * mN - 1).pow(4).multiply(9)))
        .divide(mN + 1).divide(256);
      mA = mB;
      mB = mC;
      mC = t;
    }
    return mC.num();
  }

}
