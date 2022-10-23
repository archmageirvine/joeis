package irvine.oeis.a053;

import irvine.math.group.IntegerField;
import irvine.math.group.PolynomialRingField;
import irvine.math.polynomial.Polynomial;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A053267 Coefficients of the '5th-order' mock theta function Psi(q).
 * @author Sean A. Irvine
 */
public class A053267 extends Sequence0 {

  private static final PolynomialRingField<Z> RING = new PolynomialRingField<>(IntegerField.SINGLETON);
  private int mN = -1;

  @Override
  public Z next() {
    if (++mN == 0) {
      return Z.ZERO;
    }
    Polynomial<Z> sum = RING.zero();
    for (int t, k = 0; (t = 5 * k * k) <= mN; ++k) {
      Polynomial<Z> prod = RING.one();
      for (int j = 2, i = 1; j <= 5 * k + 2; j += i, i = 5 - i) {
        prod = RING.multiply(prod, RING.oneMinusXToTheN(j), mN - t);
      }
      sum = RING.add(sum, RING.series(RING.one(), prod, mN - t).shift(t));
    }
    return sum.coeff(mN);
  }
}
