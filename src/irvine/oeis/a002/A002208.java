package irvine.oeis.a002;

import irvine.math.group.PolynomialRingField;
import irvine.math.polynomial.Polynomial;
import irvine.math.q.Q;
import irvine.math.q.Rationals;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A002208 Numerators of coefficients for numerical integration.
 * @author Sean A. Irvine
 */
public class A002208 extends Sequence0 {

  private static final PolynomialRingField<Q> RING = new PolynomialRingField<>(Rationals.SINGLETON);
  private static final Polynomial<Q> NEG_X = RING.negate(RING.x());
  private static final Polynomial<Q> XM1 = RING.oneMinusXToTheN(1);
  private int mN = -1;

  @Override
  public Z next() {
    ++mN;
    return RING.coeff(NEG_X, RING.multiply(XM1, RING.log1p(NEG_X, mN + 1)), mN).num();
  }
}
