package irvine.oeis.a068;

import irvine.math.group.PolynomialRingField;
import irvine.math.q.Q;
import irvine.math.q.Rationals;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A068556 From numerators in expansion of tan(arcsinh(x)) - sin(arctanh(x)).
 * @author Sean A. Irvine
 */
public class A068556 extends Sequence0 {

  private static final PolynomialRingField<Q> RING = new PolynomialRingField<>(Rationals.SINGLETON);
  private int mN = 0;

  protected Z select(final Q n) {
    return n.num();
  }

  @Override
  public Z next() {
    mN += 2;
    return select(RING.tan(RING.asinh(RING.x(), mN), mN).coeff(mN - 1).subtract(RING.sin(RING.atanh(RING.x(), mN), mN).coeff(mN - 1)));
  }
}

