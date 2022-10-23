package irvine.oeis.a012;

import irvine.math.group.PolynomialRingField;
import irvine.math.q.Q;
import irvine.math.q.Rationals;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A012276 Expansion of e.g.f. arctan(exp(x)*log(x+1)).
 * @author Sean A. Irvine
 */
public class A012276 extends Sequence0 {

  private static final PolynomialRingField<Q> RING = new PolynomialRingField<>(Rationals.SINGLETON);
  private int mN = 0;
  private Z mF = Z.ONE;

  @Override
  public Z next() {
    if (++mN == 1) {
      return Z.ONE;
    }
    mF = mF.multiply(mN);
    return RING.atan(RING.multiply(RING.exp(RING.x(), mN), RING.log1p(RING.x(), mN), mN), mN).coeff(mN).multiply(mF).toZ();
  }
}
