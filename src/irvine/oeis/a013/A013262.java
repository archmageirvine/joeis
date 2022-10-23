package irvine.oeis.a013;

import irvine.math.group.PolynomialRingField;
import irvine.math.q.Q;
import irvine.math.q.Rationals;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A013262 E.g.f.: cos(log(x+1)-sinh(x))=1-3/4!*x^4+10/5!*x^5-100/6!*x^6+693/7!*x^7...
 * @author Sean A. Irvine
 */
public class A013262 extends Sequence0 {

  private static final PolynomialRingField<Q> RING = new PolynomialRingField<>(Rationals.SINGLETON);
  private int mN = -1;
  private Z mF = Z.ONE;

  @Override
  public Z next() {
    if (++mN == 0) {
      return Z.ONE;
    }
    mF = mF.multiply(mN);
    return RING.cos(RING.subtract(RING.log1p(RING.x(), mN), RING.sinh(RING.x(), mN)), mN).coeff(mN).multiply(mF).toZ();
  }
}
