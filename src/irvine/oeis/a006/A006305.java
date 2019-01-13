package irvine.oeis.a006;

import irvine.math.group.IntegerField;
import irvine.math.group.PolynomialRingField;
import irvine.math.polynomial.Polynomial;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A006305.
 * @author Sean A. Irvine
 */
public class A006305 implements Sequence {

  private static final PolynomialRingField<Z> RING = new PolynomialRingField<>(IntegerField.SINGLETON);
  private static final Polynomial<Z> C = RING.pow(RING.oneMinusXToTheN(1), 2);
  private int mN = -1;

  @Override
  public Z next() {
    ++mN;
    Polynomial<Z> sum = RING.zero();
    for (int n = 0; n <= mN; ++n) {
      Polynomial<Z> num = RING.monomial(Z.ONE, n * n + n);
      for (int k = 2; k <= 2 * n; k += 2) {
        num = RING.multiply(num, RING.onePlusXToTheN(k), mN);
      }
      Polynomial<Z> den = C;
      for (int k = 1; k <= n; ++k) {
        den = RING.multiply(den, RING.oneMinusXToTheN(2 * k), mN);
        den = RING.multiply(den, RING.pow(RING.oneMinusXToTheN(2 * k + 1), 2, mN), mN);
      }
      sum = RING.add(sum, RING.series(num, den, mN));
    }
    return sum.coeff(mN);
  }
}

