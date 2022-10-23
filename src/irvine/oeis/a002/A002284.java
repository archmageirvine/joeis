package irvine.oeis.a002;

import irvine.math.group.IntegerField;
import irvine.math.group.PolynomialRingField;
import irvine.math.polynomial.Polynomial;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A002284 q-expansion of modular form of weight 13/2: eta(8 tau)^12 * theta(tau).
 * @author Sean A. Irvine
 */
public class A002284 extends Sequence0 {

  private static final PolynomialRingField<Z> RING = new PolynomialRingField<>(IntegerField.SINGLETON);
  private int mN = -1;

  @Override
  public Z next() {
    ++mN;
    Polynomial<Z> p = RING.monomial(Z.ONE, 4);
    for (int k = 1; k <= mN; ++k) {
      final Polynomial<Z> a = RING.pow(RING.oneMinusXToTheN(2 * k), 5, mN);
      final Polynomial<Z> b = RING.pow(RING.oneMinusXToTheN(8 * k), 12, mN);
      final Polynomial<Z> c = RING.multiply(RING.oneMinusXToTheN(k), RING.oneMinusXToTheN(4 * k), mN);
      final Polynomial<Z> q = RING.series(RING.multiply(a, b, mN), RING.pow(c, 2, mN), mN);
      p = RING.multiply(p, q);
    }
    return p.coeff(mN);
  }
}
