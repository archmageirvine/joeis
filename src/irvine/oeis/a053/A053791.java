package irvine.oeis.a053;

import irvine.math.group.PolynomialRingField;
import irvine.math.polynomial.Polynomial;
import irvine.math.q.Q;
import irvine.math.q.Rationals;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A053791 Number of walks of length n on the square lattice that start from (0,0) and do not touch the nonpositive real axis once they have left their starting point.
 * @author Sean A. Irvine
 */
public class A053791 extends Sequence0 {

  private static final PolynomialRingField<Q> RING = new PolynomialRingField<>(Rationals.SINGLETON);
  private static final Polynomial<Q> C = RING.monomial(Q.FOUR, 1);
  private static final Polynomial<Q> C3 = RING.pow(RING.oneMinusXToTheN(Q.FOUR, 1), 3);
  private int mN = -1;

  @Override
  public Z next() {
    ++mN;
    final Polynomial<Q> num = RING.multiply(RING.add(RING.one(), RING.sqrt1p(C, mN)), RING.add(RING.one(), RING.sqrt1m(C, mN)), mN);
    final Polynomial<Q> den = RING.sqrt(C3, mN);
    return RING.sqrt(RING.divide(RING.series(num, den, mN), Q.FOUR), mN)
      .coeff(mN)
      .toZ();
  }
}
