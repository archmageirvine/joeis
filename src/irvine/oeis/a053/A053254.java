package irvine.oeis.a053;

import irvine.math.group.IntegerField;
import irvine.math.group.PolynomialRingField;
import irvine.math.polynomial.Polynomial;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A053254 Coefficients of the '3rd order' mock theta function nu(q).
 * @author Sean A. Irvine
 */
public class A053254 extends Sequence0 {

  private static final PolynomialRingField<Z> RING = new PolynomialRingField<>(IntegerField.SINGLETON);
  private int mN = -1;

  @Override
  public Z next() {
    ++mN;
    Polynomial<Z> sum = RING.zero();
    for (int k = 0; k * k <= mN; ++k) {
      Polynomial<Z> prod = RING.one();
      for (int j = 0; j <= k; ++j) {
        prod = RING.multiply(prod, RING.onePlusXToTheN(2 * j + 1), mN);
      }
      final int t = k * (k + 1);
      sum = RING.add(sum, RING.series(RING.one(), prod, mN - t).shift(t));
    }
    return sum.coeff(mN);
  }
}

