package irvine.oeis.a071;

import irvine.math.group.PolynomialRingField;
import irvine.math.q.Q;
import irvine.math.q.Rationals;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A071968 Denominators of coefficients of expansion of arctan(x)^2 = x^2-2/3*x^4+23/45*x^6-44/105*x^8+563/1575*x^10-3254/10395*x^12+ ...
 * @author Sean A. Irvine
 */
public class A071968 extends Sequence0 {

  private static final PolynomialRingField<Q> RING = new PolynomialRingField<>(Rationals.SINGLETON);
  private int mN = -2;

  @Override
  public Z next() {
    mN += 2;
    return RING.pow(RING.atan(RING.x(), mN), 2, mN).coeff(mN).den();
  }
}
