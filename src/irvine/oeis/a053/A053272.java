package irvine.oeis.a053;

import irvine.math.group.IntegerField;
import irvine.math.group.PolynomialRingField;
import irvine.math.polynomial.Polynomial;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A053272 Coefficients of the '6th-order' mock theta function lambda(q).
 * @author Sean A. Irvine
 */
public class A053272 extends Sequence0 {

  private static final PolynomialRingField<Z> RING = new PolynomialRingField<>(IntegerField.SINGLETON);
  private int mN = -1;

  @Override
  public Z next() {
    ++mN;
    Polynomial<Z> sum = RING.zero();
    for (int k = 0; k <= mN; ++k) {
      Polynomial<Z> num = RING.one();
      Polynomial<Z> den = RING.one();
      for (int j = 1; j <= k; ++j) {
        num = RING.multiply(num, RING.oneMinusXToTheN(2 * j - 1), mN - k);
        den = RING.multiply(den, RING.onePlusXToTheN(j), mN - k);
      }
      sum = RING.signedAdd((k & 1) == 0, sum, RING.series(num, den, mN - k).shift(k));
    }
    return sum.coeff(mN);
  }
}

