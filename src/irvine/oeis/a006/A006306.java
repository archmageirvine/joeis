package irvine.oeis.a006;

import irvine.math.group.IntegerField;
import irvine.math.group.PolynomialRingField;
import irvine.math.polynomial.Polynomial;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A006306 Coefficients of the '2nd order' mock theta function mu(q).
 * @author Sean A. Irvine
 */
public class A006306 implements Sequence {

  private static final PolynomialRingField<Z> RING = new PolynomialRingField<>(IntegerField.SINGLETON);
  private int mN = -1;

  @Override
  public Z next() {
    ++mN;
    Polynomial<Z> sum = RING.zero();
    for (int n = 0; n <= mN; ++n) {
      Polynomial<Z> num = RING.monomial(Z.ONE, n * n);
      for (int k = 1; k < 2 * n; k += 2) {
        num = RING.multiply(num, RING.oneMinusXToTheN(k), mN);
      }
      Polynomial<Z> den = RING.one();
      for (int k = 1; k <= n; ++k) {
        den = RING.multiply(den, RING.pow(RING.onePlusXToTheN(2 * k), 2, mN), mN);
      }
      sum = RING.signedAdd((n & 1) == 0, sum, RING.series(num, den, mN));
    }
    return sum.coeff(mN);
  }
}

