package irvine.oeis.a053;

import irvine.math.group.IntegerField;
import irvine.math.group.PolynomialRingField;
import irvine.math.polynomial.Polynomial;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A053280 A '7th-order' mock theta function.
 * @author Sean A. Irvine
 */
public class A053280 extends Sequence0 {

  private static final PolynomialRingField<Z> RING = new PolynomialRingField<>(IntegerField.SINGLETON);
  private int mN = -1;

  @Override
  public Z next() {
    ++mN;
    Polynomial<Z> sum = RING.zero();
    for (int t, k = 1; (t = 7 * k * (k - 1)) <= mN; ++k) {
      Polynomial<Z> den = RING.one();
      for (int j = -k; j < k; ++j) {
        den = RING.multiply(den, RING.oneMinusXToTheN(Math.abs(7 * j + 3)), mN - t);
      }
      sum = RING.add(sum, RING.series(RING.one(), den, mN - t).shift(t));
    }
    return sum.coeff(mN);
  }
}

