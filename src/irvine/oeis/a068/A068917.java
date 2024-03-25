package irvine.oeis.a068;

import irvine.math.group.PolynomialRingField;
import irvine.math.q.Q;
import irvine.math.q.Rationals;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A068917 Numerators of coefficients in 1/sin(x) - 1/sinh(x) power series.
 * @author Sean A. Irvine
 */
public class A068917 extends Sequence1 {

  private static final PolynomialRingField<Q> RING = new PolynomialRingField<>(Rationals.SINGLETON);
  private int mN = -2;

  protected Z select(final Q n) {
    return n.num();
  }

  @Override
  public Z next() {
    mN += 4;
    return select(RING.xcsc(RING.x(), mN).coeff(mN).subtract(RING.xcsch(RING.x(), mN).coeff(mN)));
  }
}

