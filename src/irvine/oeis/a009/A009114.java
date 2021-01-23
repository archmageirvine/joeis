package irvine.oeis.a009;

import irvine.math.group.PolynomialRingField;
import irvine.math.q.Q;
import irvine.math.q.Rationals;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A009114 Expansion of e.g.f. cos(x)/exp(tan(x)).
 * @author Sean A. Irvine
 */
public class A009114 implements Sequence {

  private static final PolynomialRingField<Q> RING = new PolynomialRingField<>(Rationals.SINGLETON);
  private int mN = -1;
  private Z mF = Z.ONE;

  @Override
  public Z next() {
    if (++mN == 0) {
      return Z.ONE;
    }
    mF = mF.multiply(mN);
    return RING.coeff(RING.cos(RING.x(), mN), RING.exp(RING.tan(RING.x(), mN), mN), mN).multiply(mF).toZ();
  }
}
