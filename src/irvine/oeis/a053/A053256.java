package irvine.oeis.a053;

import irvine.math.group.IntegerField;
import irvine.math.group.PolynomialRingField;
import irvine.math.polynomial.Polynomial;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A053256 Coefficients of the '5th-order' mock theta function f_0(q).
 * @author Sean A. Irvine
 */
public class A053256 implements Sequence {

  private static final PolynomialRingField<Z> RING = new PolynomialRingField<>(IntegerField.SINGLETON);
  private int mN = -1;

  @Override
  public Z next() {
    ++mN;
    Polynomial<Z> sum = RING.zero();
    for (int k = 0; k * k <= mN; ++k) {
      Polynomial<Z> prod = RING.one();
      for (int j = 1; j <= k; ++j) {
        prod = RING.multiply(prod, RING.onePlusXToTheN(j), mN - k * k);
      }
      sum = RING.add(sum, RING.series(RING.one(), prod, mN - k * k).shift(k * k));
    }
    return sum.coeff(mN);
  }
}

