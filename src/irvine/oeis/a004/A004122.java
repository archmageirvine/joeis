package irvine.oeis.a004;

import irvine.math.group.PolynomialRingField;
import irvine.math.polynomial.Polynomial;
import irvine.math.q.Q;
import irvine.math.q.Rationals;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A004122 Generalized weak orders on n points.
 * @author Sean A. Irvine
 */
public class A004122 extends Sequence1 {

  private static final PolynomialRingField<Q> RING = new PolynomialRingField<>(Rationals.SINGLETON);
  private static final Polynomial<Q> TWO = RING.monomial(Q.TWO, 0);
  private Z mF = Z.ONE;
  private int mN = 0;

  @Override
  public Z next() {
    ++mN;
    mF = mF.multiply(mN);
    final Polynomial<Q> exp = RING.exp(RING.x(), mN);
    final Polynomial<Q> den = RING.subtract(TWO, RING.multiply(exp, RING.exp(RING.subtract(exp, RING.one()), mN), mN));
    return RING.coeff(RING.one(), den, mN).multiply(mF).toZ();
  }
}
