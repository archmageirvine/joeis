package irvine.oeis.a006;

import irvine.math.group.IntegerField;
import irvine.math.group.PolynomialRingField;
import irvine.math.polynomial.Polynomial;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A006304.
 * @author Sean A. Irvine
 */
public class A006304 implements Sequence {

  private static final PolynomialRingField<Z> RING = new PolynomialRingField<>(IntegerField.SINGLETON);
  private int mN = -1;

  @Override
  public Z next() {
    ++mN;
    Polynomial<Z> sum = RING.zero();
    for (int n = 0; n <= mN; ++n) {
      Polynomial<Z> num = RING.monomial(Z.ONE, n + 1);
      for (int k = 2; k <= Math.min(2 * n, mN); k += 2) {
        num = RING.multiply(num, RING.onePlusXToTheN(k), mN);
      }
      Polynomial<Z> den = RING.one();
      for (int k = 1; k <= Math.min(2 * n + 1, mN); k += 2) {
        den = RING.multiply(den, RING.oneMinusXToTheN(k), mN);
      }
      sum = RING.add(sum, RING.series(num, den, mN));
    }
    return sum.coeff(mN);
  }
}
