package irvine.oeis.a009;

import irvine.math.group.PolynomialRingField;
import irvine.math.q.Q;
import irvine.math.q.Rationals;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A009049 Expansion of cos(sin(x)*log(1+x)).
 * @author Sean A. Irvine
 */
public class A009049 extends Sequence0 {

  private static final PolynomialRingField<Q> RING = new PolynomialRingField<>(Rationals.SINGLETON);
  private int mN = -1;
  private Z mF = Z.ONE;

  @Override
  public Z next() {
    if (++mN == 0) {
      return Z.ONE;
    }
    mF = mF.multiply(mN);
    return RING.cos(RING.multiply(RING.sin(RING.x(), mN), RING.log1p(RING.x(), mN), mN), mN).coeff(mN).multiply(mF).toZ();
  }
}
