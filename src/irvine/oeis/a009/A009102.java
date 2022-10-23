package irvine.oeis.a009;

import irvine.math.group.PolynomialRingField;
import irvine.math.polynomial.Polynomial;
import irvine.math.q.Q;
import irvine.math.q.Rationals;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A009102 Expansion of e.g.f. cos(x)/(1+x).
 * @author Sean A. Irvine
 */
public class A009102 extends Sequence0 {

  private static final PolynomialRingField<Q> RING = new PolynomialRingField<>(Rationals.SINGLETON);
  private static final Polynomial<Q> DEN = RING.onePlusXToTheN(1);
  private int mN = -1;
  private Z mF = Z.ONE;

  @Override
  public Z next() {
    if (++mN == 0) {
      return Z.ONE;
    }
    mF = mF.multiply(mN);
    return RING.coeff(RING.cos(RING.x(), mN), DEN, mN).multiply(mF).toZ();
  }
}
