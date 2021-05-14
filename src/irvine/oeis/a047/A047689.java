package irvine.oeis.a047;

import irvine.math.group.PolynomialRingField;
import irvine.math.q.Q;
import irvine.math.q.Rationals;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A047689 Numerators of coefficients in Taylor series for exp(cos(x)-1).
 * @author Sean A. Irvine
 */
public class A047689 implements Sequence {

  private static final PolynomialRingField<Q> RING = new PolynomialRingField<>(Rationals.SINGLETON);
  private int mN = -2;

  protected Z select(final Q n) {
    return n.num();
  }

  @Override
  public Z next() {
    mN += 2;
    return select(RING.exp(RING.subtract(RING.cos(RING.x(), mN), RING.one()), mN).coeff(mN));
  }
}
