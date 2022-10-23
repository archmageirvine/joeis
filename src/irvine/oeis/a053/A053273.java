package irvine.oeis.a053;

import irvine.math.group.IntegerField;
import irvine.math.group.PolynomialRingField;
import irvine.math.polynomial.Polynomial;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A053273 Coefficients of the '6th-order' mock theta function 2 mu(q).
 * @author Sean A. Irvine
 */
public class A053273 extends Sequence0 {

  private static final PolynomialRingField<Z> RING = new PolynomialRingField<>(IntegerField.SINGLETON);
  private int mN = -1;

  private Polynomial<Z> ser(final int k, final int degreeLimit) {
    Polynomial<Z> num = RING.onePlusXToTheN(k);
    for (int j = 1; j <= 2 * k; j += 2) {
      num = RING.multiply(num, RING.oneMinusXToTheN(j), degreeLimit);
    }
    Polynomial<Z> den = RING.one();
    for (int j = 1; j <= k + 1; ++j) {
      den = RING.multiply(den, RING.onePlusXToTheN(j), degreeLimit);
    }
    return RING.series(num, den, degreeLimit);
  }

  @Override
  public Z next() {
    ++mN;
    Polynomial<Z> sum = RING.one();
    for (int k = 0; k <= mN; ++k) {
      final int s = mN - k;
      sum = RING.signedAdd((k & 1) == 0, sum, ser(k, s).shift(k + 1));
    }
    return sum.coeff(mN);
  }
}
