package irvine.oeis.a002;

import irvine.math.group.IntegerField;
import irvine.math.group.PolynomialRingField;
import irvine.math.polynomial.Polynomial;
import irvine.math.z.Z;
import irvine.oeis.Sequence3;

/**
 * A002130 Generalized sum of divisors function.
 * @author Sean A. Irvine
 */
public class A002130 extends Sequence3 {

  private static final PolynomialRingField<Z> RING = new PolynomialRingField<>(IntegerField.SINGLETON);
  private int mN = 2;

  private Polynomial<Z> t(final int i, final int n) {
    Polynomial<Z> s = RING.zero();
    for (int k = 1; k <= n; ++k) {
      final Polynomial<Z> t = RING.series(RING.monomial(Z.ONE, k * i), RING.pow(RING.onePlusXToTheN(k), 2L * i, n), n);
      s = RING.add(s, t);
    }
    return s;
  }

  @Override
  public Z next() {
    ++mN;
    return RING.pow(t(1, mN), 2, mN).coeff(mN).subtract(t(2, mN).coeff(mN)).divide2();
  }
}
