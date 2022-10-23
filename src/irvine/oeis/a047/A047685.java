package irvine.oeis.a047;

import irvine.math.group.PolynomialRingField;
import irvine.math.q.Q;
import irvine.math.q.Rationals;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A047685 Numerators of coefficients in Taylor series for log(tan(x)/x).
 * @author Sean A. Irvine
 */
public class A047685 extends Sequence0 {

  private static final PolynomialRingField<Q> RING = new PolynomialRingField<>(Rationals.SINGLETON);
  private int mN = -2;

  protected Z select(final Q n) {
    return n.num();
  }

  @Override
  public Z next() {
    mN += 2;
    return select(RING.log(RING.tan(RING.x(), mN + 1).shift(-1), mN).coeff(mN));
  }
}
