package irvine.oeis.a069;

import irvine.math.group.PolynomialRingField;
import irvine.math.q.Q;
import irvine.math.q.Rationals;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A069854 Denominators of coefficients of expansion of sinh(x)/sin(x) (even powers only).
 * @author Sean A. Irvine
 */
public class A069854 extends Sequence0 {

  private static final PolynomialRingField<Q> RING = new PolynomialRingField<>(Rationals.SINGLETON);
  private int mN = -2;

  @Override
  public Z next() {
    mN += 2;
    return RING.coeff(RING.sinh(RING.x(), mN + 1), RING.sin(RING.x(), mN + 1), mN).den();
  }
}

