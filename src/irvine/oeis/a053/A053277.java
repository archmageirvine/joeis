package irvine.oeis.a053;

import irvine.math.group.IntegerField;
import irvine.math.group.PolynomialRingField;
import irvine.math.polynomial.Polynomial;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A053277 Coefficients of the '7th-order' mock theta function F_2(q).
 * @author Sean A. Irvine
 */
public class A053277 implements Sequence {

  private static final PolynomialRingField<Z> RING = new PolynomialRingField<>(IntegerField.SINGLETON);
  private int mN = -1;

  @Override
  public Z next() {
    ++mN;
    Polynomial<Z> sum = RING.zero();
    for (int t, k = 0; (t = k * (k + 1)) <= mN; ++k) {
      Polynomial<Z> den = RING.one();
      for (int j = k + 1; j <= 2 * k + 1; ++j) {
        den = RING.multiply(den, RING.oneMinusXToTheN(j), mN - t);
      }
      sum = RING.add(sum, RING.series(RING.one(), den, mN - t).shift(t));
    }
    return sum.coeff(mN);
  }
}

