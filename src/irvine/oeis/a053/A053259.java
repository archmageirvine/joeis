package irvine.oeis.a053;

import irvine.math.group.IntegerField;
import irvine.math.group.PolynomialRingField;
import irvine.math.polynomial.Polynomial;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A053259 Coefficients of the '5th-order' mock theta function phi_1(q).
 * @author Sean A. Irvine
 */
public class A053259 extends Sequence0 {

  private static final PolynomialRingField<Z> RING = new PolynomialRingField<>(IntegerField.SINGLETON);
  private int mN = -1;

  @Override
  public Z next() {
    ++mN;
    Polynomial<Z> sum = RING.zero();
    for (int k = 0; k * k <= mN; ++k) {
      final int t = (k + 1) * (k + 1);
      Polynomial<Z> prod = RING.one();
      for (int j = 1; j <= k; ++j) {
        prod = RING.multiply(prod, RING.onePlusXToTheN(2 * j - 1), mN - t);
      }
      sum = RING.add(sum, prod.shift(t));
    }
    return sum.coeff(mN);
  }
}
