package irvine.oeis.a046;

import irvine.math.group.PolynomialRingField;
import irvine.math.q.Q;
import irvine.math.q.Rationals;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A046981 Denominators of Taylor series for exp(x)*cos(x).
 * @author Sean A. Irvine
 */
public class A046981 extends Sequence0 {

  private static final PolynomialRingField<Q> RING = new PolynomialRingField<>(Rationals.SINGLETON);
  private int mN = -1;

  @Override
  public Z next() {
    return RING.multiply(RING.exp(RING.x(), ++mN), RING.cos(RING.x(), mN), mN).coeff(mN).den();
  }
}
