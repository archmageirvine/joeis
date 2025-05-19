package irvine.oeis.a383;

import irvine.math.function.Functions;
import irvine.math.group.PolynomialRingField;
import irvine.math.polynomial.Polynomial;
import irvine.math.q.Q;
import irvine.math.q.Rationals;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A383732 allocated for Guy Amit.
 * @author Sean A. Irvine
 */
public class A383992 extends Sequence0 {

  private static final PolynomialRingField<Q> RING = new PolynomialRingField<>(Rationals.SINGLETON);
  private static final Polynomial<Q> X2 = RING.monomial(Q.ONE, 2);
  private static final Polynomial<Q> C1 = Polynomial.create(Q.ONE, Q.ONE);
  private int mN = -1;

  @Override
  public Z next() {
    if (++mN == 0) {
      return Z.ZERO;
    }
    final Polynomial<Q> p = RING.series(RING.subtract(RING.log1p(RING.x(), mN), X2), C1, mN);
    return RING.exp(p, mN).coeff(mN).multiply(Functions.FACTORIAL.z(mN)).toZ();
  }
}
