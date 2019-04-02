package irvine.oeis.a002;

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.math.group.PolynomialRingField;
import irvine.math.q.Q;
import irvine.math.q.Rationals;
import irvine.math.polynomial.Polynomial;

/**
 * A002639 Numerators of expansion of Jacobi nome q in parameter m.
 * @author Sean A. Irvine
 */
public class A002639 implements Sequence {

  private static final PolynomialRingField<Q> RING = new PolynomialRingField<>(Rationals.SINGLETON);
  private int mN = -1;

  private Polynomial<Q> product(final int n) {
    Polynomial<Q> num = RING.one();
    Polynomial<Q> den = RING.one();
    for (int k = 1; k <= n; ++k) {
      final Polynomial<Q> t = RING.onePlusXToTheN(k);
      if ((k & 1) == 0) {
        num = RING.multiply(num, t);
      } else {
        den = RING.multiply(den, t);
      }
    }
    return RING.series(num, den, n);
  }


  @Override
  public Z next() {
    if (++mN < 1) {
      return Z.ZERO;
    }
    final Polynomial<Q> p = RING.reversion(RING.shift(RING.pow(product(mN), 8, mN), 1), mN);
    return p.coeff(mN).divide(Z.ONE.shiftLeft(2 * mN)).num();
  }
}
