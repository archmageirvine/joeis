package irvine.oeis.a048;

import irvine.math.group.PolynomialRingField;
import irvine.math.polynomial.Polynomial;
import irvine.math.q.Q;
import irvine.math.q.Rationals;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A048172 Number of labeled series-parallel graphs with n edges.
 * @author Sean A. Irvine
 */
public class A048172 extends Sequence1 {

  private static final PolynomialRingField<Q> RING = new PolynomialRingField<>(Rationals.SINGLETON);
  private static final Polynomial<Q> X2 = RING.monomial(Q.ONE, 2);
  private static final Polynomial<Q> XP1 = RING.onePlusXToTheN(1);
  private Z mF = Z.ONE;
  private int mN = 0;

  @Override
  public Z next() {
    mF = mF.multiply(++mN);
    return RING.reversion(RING.subtract(RING.log1p(RING.x(), mN), RING.series(X2, XP1, mN)), mN).coeff(mN).multiply(mF).toZ();
  }
}
