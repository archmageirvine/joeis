package irvine.oeis.a075;

import irvine.math.function.Functions;
import irvine.math.group.PolynomialRingField;
import irvine.math.polynomial.Polynomial;
import irvine.math.q.Q;
import irvine.math.q.Rationals;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A075169.
 * @author Sean A. Irvine
 */
public class A075178 extends Sequence0 {

  private static final PolynomialRingField<Q> RING = new PolynomialRingField<>(Rationals.SINGLETON);
  private static final Polynomial<Q> NEG_X = RING.negate(RING.x());
  private int mN = 0;

  protected Z select(final Q n) {
    return n.den();
  }

  @Override
  public Z next() {
    ++mN;
    return select(RING.coeff(RING.x(), RING.log1p(NEG_X, mN + 1), mN).multiply(Functions.FACTORIAL.z(mN - 1)));
  }
}
