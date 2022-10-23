package irvine.oeis.a038;

import irvine.math.group.IntegerField;
import irvine.math.group.PolynomialRingField;
import irvine.math.polynomial.Polynomial;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A038539 Complex semisimple Lie algebras of dimension n.
 * @author Sean A. Irvine
 */
public class A038539 extends Sequence1 {

  private static final PolynomialRingField<Z> RING = new PolynomialRingField<>(IntegerField.SINGLETON);
  private static final Polynomial<Z> X1 = RING.onePlusXToTheN(1);
  private static final Polynomial<Z> DEN = RING.multiply(RING.multiply(RING.multiply(RING.oneMinusXToTheN(14), RING.oneMinusXToTheN(52)), RING.oneMinusXToTheN(133)), RING.oneMinusXToTheN(248));
  private int mN = 0;

  @Override
  public Z next() {
    ++mN;
    Polynomial<Z> prod = RING.one();
    for (int k = 1; k * k + 2 * k <= mN; ++k) {
      prod = RING.multiply(prod, RING.oneMinusXToTheN(k * k + 2 * k), mN);
    }
    for (int k = 2; 2 * k * k + k <= mN; ++k) {
      prod = RING.multiply(prod, RING.oneMinusXToTheN(2 * k * k + k), mN);
    }
    for (int k = 3; 2 * k * k + k <= mN; ++k) {
      prod = RING.multiply(prod, RING.oneMinusXToTheN(2 * k * k + k), mN);
    }
    for (int k = 4; 2 * k * k - k <= mN; ++k) {
      prod = RING.multiply(prod, RING.oneMinusXToTheN(2 * k * k - k), mN);
    }
    return RING.coeff(X1, RING.multiply(prod, DEN, mN), mN);
  }
}
