package irvine.oeis.a046;

import irvine.math.group.PolynomialRingField;
import irvine.math.q.Q;
import irvine.math.q.Rationals;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A046977 Denominators of Taylor series for sec(x). Also denominators of Taylor series for sech(x) = 1/cosh(x).
 * @author Sean A. Irvine
 */
public class A046977 extends Sequence0 {

  private static final PolynomialRingField<Q> RING = new PolynomialRingField<>(Rationals.SINGLETON);
  private int mN = -2;

  @Override
  public Z next() {
    mN += 2;
    return RING.sec(RING.x(), mN).coeff(mN).den();
  }
}
