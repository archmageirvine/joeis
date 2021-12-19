package irvine.oeis.a053;

import irvine.math.group.IntegerField;
import irvine.math.group.PolynomialRingField;
import irvine.math.polynomial.Polynomial;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A053271 Coefficients of the '6th-order' mock theta function sigma(q).
 * @author Sean A. Irvine
 */
public class A053271 implements Sequence {

  private static final PolynomialRingField<Z> RING = new PolynomialRingField<>(IntegerField.SINGLETON);
  private int mN = -1;

  @Override
  public Z next() {
    ++mN;
    Polynomial<Z> sum = RING.zero();
    for (int t, k = 0; (t = (k + 1) * (k + 2) / 2) <= mN; ++k) {
      Polynomial<Z> num = RING.one();
      Polynomial<Z> den = RING.one();
      for (int j = 0; j <= k; ++j) {
        if (j > 0) {
          num = RING.multiply(num, RING.onePlusXToTheN(j), mN - t);
        }
        den = RING.multiply(den, RING.oneMinusXToTheN(2 * j + 1), mN - t);
      }
      sum = RING.add(sum, RING.series(num, den, mN - t).shift(t));
    }
    return sum.coeff(mN);
  }
}

