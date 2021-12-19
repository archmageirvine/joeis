package irvine.oeis.a053;

import irvine.math.group.IntegerField;
import irvine.math.group.PolynomialRingField;
import irvine.math.polynomial.Polynomial;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A053283 Coefficients of the '10th-order' mock theta function X(q).
 * @author Sean A. Irvine
 */
public class A053283 implements Sequence {

  private static final PolynomialRingField<Z> RING = new PolynomialRingField<>(IntegerField.SINGLETON);
  private int mN = -1;

  @Override
  public Z next() {
    ++mN;
    Polynomial<Z> sum = RING.zero();
    for (int t, k = 0; (t = k * k) <= mN; ++k) {
      Polynomial<Z> den = RING.one();
      for (int j = 1; j <= 2 * k; ++j) {
        den = RING.multiply(den, RING.onePlusXToTheN(j), mN - t);
      }
      sum = RING.signedAdd((k & 1) == 0, sum, RING.series(RING.one(), den, mN - t).shift(t));
    }
    return sum.coeff(mN);
  }
}

