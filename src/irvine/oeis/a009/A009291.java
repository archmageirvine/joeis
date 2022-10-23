package irvine.oeis.a009;

import irvine.math.group.PolynomialRingField;
import irvine.math.q.Q;
import irvine.math.q.Rationals;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A009291 Expansion of exp(x)/cos(tan(x)).
 * @author Sean A. Irvine
 */
public class A009291 extends Sequence0 {

  private static final PolynomialRingField<Q> RING = new PolynomialRingField<>(Rationals.SINGLETON);
  private int mN = -1;
  private Z mF = Z.ONE;

  @Override
  public Z next() {
    if (++mN == 0) {
      return Z.ONE;
    }
    mF = mF.multiply(mN);
    return RING.coeff(RING.exp(RING.x(), mN), RING.cos(RING.tan(RING.x(), mN), mN), mN).multiply(mF).toZ();
  }
}
