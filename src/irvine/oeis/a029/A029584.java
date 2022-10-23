package irvine.oeis.a029;

import irvine.math.group.PolynomialRingField;
import irvine.math.q.Q;
import irvine.math.q.Rationals;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A029584 Expansion of cos x + tan x + sec x.
 * @author Sean A. Irvine
 */
public class A029584 extends Sequence0 {

  private static final PolynomialRingField<Q> RING = new PolynomialRingField<>(Rationals.SINGLETON);
  private Z mF = Z.ONE;
  private int mN = -1;

  @Override
  public Z next() {
    if (++mN > 1) {
      mF = mF.multiply(mN);
    }
    return RING.cos(RING.x(), mN).coeff(mN)
      .add(RING.tan(RING.x(), mN).coeff(mN))
      .add(RING.sec(RING.x(), mN).coeff(mN))
      .multiply(mF).toZ();
  }
}
