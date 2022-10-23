package irvine.oeis.a053;

import irvine.math.group.IntegerField;
import irvine.math.group.PolynomialRingField;
import irvine.math.polynomial.Polynomial;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A053269 Coefficients of the '6th-order' mock theta function psi(q).
 * @author Sean A. Irvine
 */
public class A053269 extends Sequence0 {

  private static final PolynomialRingField<Z> RING = new PolynomialRingField<>(IntegerField.SINGLETON);
  private int mN = -1;

  @Override
  public Z next() {
    ++mN;
    Polynomial<Z> sum = RING.zero();
    for (int t, k = 0; (t = (k + 1) * (k + 1)) <= mN; ++k) {
      Polynomial<Z> num = RING.one();
      Polynomial<Z> den = RING.one();
      for (int j = 1; j <= 2 * k + 1; ++j) {
        if ((j & 1) == 1 && j <= 2 * k) {
          num = RING.multiply(num, RING.oneMinusXToTheN(j), mN - t);
        }
        den = RING.multiply(den, RING.onePlusXToTheN(j), mN - t);
      }
      sum = RING.signedAdd((k & 1) == 0, sum, RING.series(num, den, mN - t).shift(t));
    }
    return sum.coeff(mN);
  }
}

