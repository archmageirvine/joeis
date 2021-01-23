package irvine.oeis.a009;

import irvine.math.group.PolynomialRingField;
import irvine.math.q.Q;
import irvine.math.q.Rationals;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A009736 Expansion of e.g.f.: tan(x)*exp(sinh(x)).
 * @author Sean A. Irvine
 */
public class A009736 implements Sequence {

  private static final PolynomialRingField<Q> RING = new PolynomialRingField<>(Rationals.SINGLETON);
  private int mN = -1;
  private Z mF = Z.ONE;

  @Override
  public Z next() {
    if (++mN == 0) {
      return Z.ZERO;
    }
    mF = mF.multiply(mN);
    return RING.multiply(RING.exp(RING.sinh(RING.x(), mN), mN), RING.tan(RING.x(), mN), mN).coeff(mN).multiply(mF).toZ();
  }
}
