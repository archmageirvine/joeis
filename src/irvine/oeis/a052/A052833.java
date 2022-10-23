package irvine.oeis.a052;

import irvine.math.group.PolynomialRingField;
import irvine.math.q.Q;
import irvine.math.q.Rationals;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A052833 Expansion of e.g.f.: (log(2-exp(x)))^2.
 * @author Sean A. Irvine
 */
public class A052833 extends Sequence0 {

  private static final PolynomialRingField<Q> RING = new PolynomialRingField<>(Rationals.SINGLETON);
  private Z mF = Z.ONE;
  private int mN = -1;

  @Override
  public Z next() {
    if (++mN > 1) {
      mF = mF.multiply(mN);
    }
    return RING.pow(RING.log1p(RING.subtract(RING.one(), RING.exp(RING.x(), mN)), mN), 2, mN).coeff(mN).multiply(mF).toZ();
  }
}

