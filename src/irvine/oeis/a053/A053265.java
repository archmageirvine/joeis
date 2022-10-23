package irvine.oeis.a053;

import irvine.math.group.IntegerField;
import irvine.math.group.PolynomialRingField;
import irvine.math.polynomial.Polynomial;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A053265 Coefficients of the '5th-order' mock theta function F_1(q).
 * @author Sean A. Irvine
 */
public class A053265 extends Sequence0 {

  private static final PolynomialRingField<Z> RING = new PolynomialRingField<>(IntegerField.SINGLETON);
  private int mN = -1;

  @Override
  public Z next() {
    ++mN;
    Polynomial<Z> sum = RING.zero();
    for (int t, k = 0; (t = 2 * k * (k + 1)) <= mN; ++k) {
      Polynomial<Z> prod = RING.one();
      for (int j = 0; j <= k; ++j) {
        prod = RING.multiply(prod, RING.oneMinusXToTheN(2 * j + 1), mN - t);
      }
      sum = RING.add(sum, RING.series(RING.one(), prod, mN - t).shift(t));
    }
    return sum.coeff(mN);
  }
}
