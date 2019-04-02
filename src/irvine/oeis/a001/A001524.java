package irvine.oeis.a001;

import irvine.math.group.IntegerField;
import irvine.math.group.PolynomialRingField;
import irvine.math.polynomial.Polynomial;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A001524 Number of stacks, or arrangements of n pennies in contiguous rows, each touching 2 in row below.
 * @author Sean A. Irvine
 */
public class A001524 implements Sequence {

  private static final PolynomialRingField<Z> RING = new PolynomialRingField<>(IntegerField.SINGLETON);
  private int mN = -1;

  private Polynomial<Z> prod(final int n, final int m) {
    Polynomial<Z> p = RING.one();
    for (int k = 1; k <= n; ++k) {
      p = RING.multiply(p, RING.oneMinusXToTheN(k), m);
    }
    return p;
  }

  private Polynomial<Z> sum(final int n) {
    Polynomial<Z> s = RING.one();
    for (int k = 1, u = 1; u <= n; ++k, u = u * (k + 1) / (k - 1)) {
      final Polynomial<Z> denom = RING.multiply(RING.oneMinusXToTheN(k), RING.pow(prod(k - 1, n), 2, n), n);
      s = RING.add(s, RING.series(RING.monomial(Z.ONE, u), denom, n));
    }
    return s;
  }

  @Override
  public Z next() {
    ++mN;
    return sum(mN).coeff(mN);
  }
}
