package irvine.oeis.a047;

import irvine.math.group.PolynomialRingField;
import irvine.math.polynomial.Polynomial;
import irvine.math.q.Q;
import irvine.math.q.Rationals;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A047788 Numerators of Glaisher's I-numbers.
 * @author Sean A. Irvine
 */
public class A047788 extends Sequence0 {

  private static final PolynomialRingField<Q> RING = new PolynomialRingField<>(Rationals.SINGLETON);
  private static final Polynomial<Q> NUM = RING.monomial(Q.THREE, 0);
  private static final Polynomial<Q> DEN = RING.monomial(Q.TWO, 0);
  private static final Q Q4 = Q.FOUR;
  private int mN = -2;
  private Z mF = Z.ONE;

  protected Z select(final Q n) {
    return n.num().abs();
  }

  @Override
  public Z next() {
    mN += 2;
    if (mN > 0) {
      mF = mF.multiply(mN).multiply(mN - 1);
    }
    return select(RING.coeff(NUM, RING.add(DEN, RING.multiply(RING.cosh(RING.x(), mN), Q4)), mN).multiply(mF));
  }
}
