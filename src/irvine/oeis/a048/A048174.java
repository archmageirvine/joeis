package irvine.oeis.a048;

import irvine.math.group.PolynomialRingField;
import irvine.math.polynomial.Polynomial;
import irvine.math.q.Q;
import irvine.math.q.Rationals;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A048174 Number of labeled chains with n edges.
 * @author Sean A. Irvine
 */
public class A048174 extends Sequence1 {

  private static final PolynomialRingField<Q> RING = new PolynomialRingField<>(Rationals.SINGLETON);
  private static final Polynomial<Q> X2 = RING.monomial(Q.ONE, 2);
  private static final Polynomial<Q> XP1 = RING.onePlusXToTheN(1);
  private Z mF = Z.ONE;
  private int mN = 0;

  @Override
  public Z next() {
    mF = mF.multiply(++mN);
    final Polynomial<Q> egf = RING.reversion(RING.subtract(RING.log1p(RING.x(), mN), RING.series(X2, XP1, mN)), mN);
    return RING.series(egf, RING.add(RING.one(), egf), mN).coeff(mN).multiply(mF).toZ();
  }
}
