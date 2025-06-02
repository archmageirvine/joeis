package irvine.oeis.a382;

import irvine.math.group.IntegerField;
import irvine.math.group.PolynomialRingField;
import irvine.math.polynomial.Polynomial;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A077584.
 * @author Sean A. Irvine
 */
public class A382454 extends Sequence0 {

  private static final PolynomialRingField<Z> RING = new PolynomialRingField<>(IntegerField.SINGLETON);
  private static final Polynomial<Z> C = RING.oneMinusXToTheN(1);
  private int mN = -1;

  @Override
  public Z next() {
    ++mN;
    Polynomial<Z> prod = RING.one();
    for (int j = 1; j <= 2 * mN + 1; ++j) {
      prod = RING.multiply(prod, RING.series(RING.oneMinusXToTheN(j), C, mN), mN);
    }
    return prod.coeff(mN);
  }
}
