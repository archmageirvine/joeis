package irvine.oeis.a072;

import irvine.math.group.PolynomialRingField;
import irvine.math.polynomial.Polynomial;
import irvine.math.q.Q;
import irvine.math.q.Rationals;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A072948 Number of permutations p of {1,2,3,...,2n} such that Sum_{k=1..2n} abs(k-p(k)) = 2n.
 * @author Sean A. Irvine
 */
public class A072948 extends Sequence0 {

  private static final PolynomialRingField<Q> INNER = new PolynomialRingField<>("t", Rationals.SINGLETON);
  private static final PolynomialRingField<Polynomial<Q>> RING = new PolynomialRingField<>("z", INNER);
  private int mN = -1;

  @Override
  public Z next() {
    ++mN;
    Polynomial<Polynomial<Q>> gf = RING.one();
    for (int k = 2 * mN; k > 0; --k) {
      final int a = (k + 1) / 2;
      final int b = k / 2;
      gf = RING.series(RING.one(), RING.subtract(RING.one(), RING.multiply(gf, INNER.monomial(new Q(a), b)).shift(1)), 2 * mN);
    }
    return gf.coeff(2 * mN).coeff(mN).toZ();
  }
}
