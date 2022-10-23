package irvine.oeis.a009;

import irvine.math.group.PolynomialRingField;
import irvine.math.q.Q;
import irvine.math.q.Rationals;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A009390 Expansion of e.g.f.: log(1 + tanh(x))*exp(x).
 * @author Sean A. Irvine
 */
public class A009390 extends Sequence0 {

  private static final PolynomialRingField<Q> RING = new PolynomialRingField<>(Rationals.SINGLETON);
  private int mN = -1;
  private Z mF = Z.ONE;

  @Override
  public Z next() {
    if (++mN == 0) {
      return Z.ZERO;
    }
    mF = mF.multiply(mN);
    return RING.multiply(RING.log1p(RING.tanh(RING.x(), mN), mN), RING.exp(RING.x(), mN), mN).coeff(mN).multiply(mF).toZ();
  }
}
