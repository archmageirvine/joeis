package irvine.oeis.a096;

import irvine.math.group.IntegerField;
import irvine.math.group.PolynomialRingField;
import irvine.math.polynomial.Polynomial;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A096419 Number of cyclically symmetric plane partitions <code>(Macdonald</code>'s plane partition <code>conjecture)</code>.
 * @author Sean A. Irvine
 */
public class A096419 implements Sequence {

  private static final PolynomialRingField<Z> RING = new PolynomialRingField<>(IntegerField.SINGLETON);
  private int mN = 0;

  private Polynomial<Z> innerProduct(final int i, final int m, final int n) {
    Polynomial<Z> num = RING.one();
    Polynomial<Z> den = RING.one();
    for (int j = i; j <= m; ++j) {
      num = RING.multiply(num, RING.oneMinusXToTheN(3 * (m + i + j - 1)), n);
      den = RING.multiply(den, RING.oneMinusXToTheN(3 * (2 * i + j - 1)), n);
    }
    return RING.series(num, den, n);
  }

  private Polynomial<Z> outerProduct(final int n) {
    Polynomial<Z> num = RING.one();
    Polynomial<Z> den = RING.one();
    for (int i = 1; i <= n; ++i) {
      num = RING.multiply(RING.multiply(num, RING.oneMinusXToTheN(3 * i - 1), n), innerProduct(i, n, n), n);
      den = RING.multiply(den, RING.oneMinusXToTheN(3 * i - 2), n);
    }
    return RING.series(num, den, n);
  }

  @Override
  public Z next() {
    return outerProduct(++mN).coeff(mN);
  }
}
