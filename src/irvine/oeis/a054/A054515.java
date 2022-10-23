package irvine.oeis.a054;

import irvine.math.group.IntegerField;
import irvine.math.group.PolynomialRingField;
import irvine.math.polynomial.Polynomial;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A054515 Number of ways to place non-intersecting diagonals in convex (n+2)-gon so as to create no quadrilaterals.
 * @author Sean A. Irvine
 */
public class A054515 extends Sequence0 {

  private static final PolynomialRingField<Z> RING = new PolynomialRingField<>(IntegerField.SINGLETON);
  private static final Polynomial<Z> C = Polynomial.create(0, 1, -2, 1, -1);
  private static final Polynomial<Z> D = RING.oneMinusXToTheN(1);
  private int mN = 0;

  @Override
  public Z next() {
    return RING.reversion(RING.series(C, D, ++mN), mN).coeff(mN);
  }
}
