package irvine.oeis.a009;

import irvine.math.group.PolynomialRingField;
import irvine.math.q.Q;
import irvine.math.q.Rationals;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A009013 Expansion of E.g.f.: 1/(cosh(x)*cos(x)) (only powers that are multiples of 4).
 * @author Sean A. Irvine
 */
public class A009013 extends Sequence0 {

  private static final PolynomialRingField<Q> RING = new PolynomialRingField<>(Rationals.SINGLETON);
  private int mN = -4;
  private Z mF = Z.ONE;

  @Override
  public Z next() {
    mN += 4;
    if (mN == 0) {
      return Z.ONE;
    }
    mF = mF.multiply(mN).multiply(mN - 1).multiply(mN - 2).multiply(mN - 3);
    return RING.coeff(RING.one(), RING.multiply(RING.cos(RING.x(), mN), RING.cosh(RING.x(), mN), mN), mN).multiply(mF).toZ();
  }
}
