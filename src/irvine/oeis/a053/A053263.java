package irvine.oeis.a053;

import irvine.math.group.IntegerField;
import irvine.math.group.PolynomialRingField;
import irvine.math.polynomial.Polynomial;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A053263 Coefficients of the '5th-order' mock theta function chi_1(q).
 * @author Sean A. Irvine
 */
public class A053263 extends Sequence0 {

  private static final PolynomialRingField<Z> RING = new PolynomialRingField<>(IntegerField.SINGLETON);
  private int mN = -1;

  @Override
  public Z next() {
    ++mN;
    Polynomial<Z> sum = RING.zero();
    for (int k = 0; k <= mN; ++k) {
      Polynomial<Z> prod = RING.one();
      for (int j = k + 1; j <= 2 * k + 1; ++j) {
        prod = RING.multiply(prod, RING.oneMinusXToTheN(j), mN - k);
      }
      sum = RING.add(sum, RING.series(RING.one(), prod, mN - k).shift(k));
    }
    return sum.coeff(mN);
  }
}

