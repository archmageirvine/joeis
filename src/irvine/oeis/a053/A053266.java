package irvine.oeis.a053;

import irvine.math.group.IntegerField;
import irvine.math.group.PolynomialRingField;
import irvine.math.polynomial.Polynomial;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A053266 Coefficients of the '5th-order' mock theta function Phi(q).
 * @author Sean A. Irvine
 */
public class A053266 implements Sequence {

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
      for (int j = 1, i = 3; j <= 5 * k + 1; j += i, i = 5 - i) {
        prod = RING.multiply(prod, RING.oneMinusXToTheN(j), mN - t);
      }
      sum = RING.add(sum, RING.series(RING.one(), prod, mN - t).shift(t));
    }
    return sum.coeff(mN);
  }
}
