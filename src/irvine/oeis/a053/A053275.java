package irvine.oeis.a053;

import irvine.math.group.IntegerField;
import irvine.math.group.PolynomialRingField;
import irvine.math.polynomial.Polynomial;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A053275 Coefficients of the '7th-order' mock theta function F_0(q).
 * @author Sean A. Irvine
 */
public class A053275 extends Sequence0 {

  private static final PolynomialRingField<Z> RING = new PolynomialRingField<>(IntegerField.SINGLETON);
  private int mN = -1;

  @Override
  public Z next() {
    ++mN;
    Polynomial<Z> sum = RING.zero();
    for (int k = 0; k * k <= mN; ++k) {
      Polynomial<Z> den = RING.one();
      final int s = mN - k * k;
      for (int j = k + 1; j <= 2 * k; ++j) {
        den = RING.multiply(den, RING.oneMinusXToTheN(j), s);
      }
      sum = RING.add(sum, RING.series(RING.one(), den, s).shift(k * k));
    }
    return sum.coeff(mN);
  }
}

