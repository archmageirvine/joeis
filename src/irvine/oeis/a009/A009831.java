package irvine.oeis.a009;

import irvine.math.group.PolynomialRingField;
import irvine.math.q.Q;
import irvine.math.q.Rationals;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A009831 Expansion of e.g.f. tanh(x)*exp(tanh(x)).
 * @author Sean A. Irvine
 */
public class A009831 extends Sequence0 {

  private static final PolynomialRingField<Q> RING = new PolynomialRingField<>(Rationals.SINGLETON);
  private int mN = -1;
  private Z mF = Z.ONE;

  @Override
  public Z next() {
    if (++mN == 0) {
      return Z.ZERO;
    }
    mF = mF.multiply(mN);
    return RING.multiply(RING.exp(RING.tanh(RING.x(), mN), mN), RING.tanh(RING.x(), mN), mN).coeff(mN).multiply(mF).toZ();
  }
}
