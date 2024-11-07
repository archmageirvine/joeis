package irvine.oeis.a072;

import irvine.math.group.DegreeLimitedPolynomialRingField;
import irvine.math.group.PolynomialRingField;
import irvine.math.polynomial.Polynomial;
import irvine.math.q.Q;
import irvine.math.q.Rationals;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A072949 Number of permutations p of {1,2,3,...,n} such that Sum_{k=1..n} abs(k-p(k)) = 2n.
 * @author Sean A. Irvine
 */
public class A072949 extends Sequence0 {

  private int mN = -1;

  private Polynomial<Polynomial<Q>> g(final PolynomialRingField<Polynomial<Q>> ring, final PolynomialRingField<Q> inner, final int h, final int n) {
    if (h == n) {
      return ring.one();
    }
    final int i = h / 2;
    final int j = h & 1;
    final Polynomial<Polynomial<Q>> g = g(ring, inner, h + 1, n);
    return ring.subtract(ring.one(), ring.series(ring.monomial(inner.monomial(Q.valueOf(i + 1), 1), i + j), g, n));
  }

  @Override
  public Z next() {
    if (++mN < 4) {
      return mN == 0 ? Z.ONE : Z.ZERO;
    }
    final DegreeLimitedPolynomialRingField<Q> inner = new DegreeLimitedPolynomialRingField<>("z", Rationals.SINGLETON, mN);
    final PolynomialRingField<Polynomial<Q>> ring = new PolynomialRingField<>("t", inner);
    return ring.coeff(ring.one(), g(ring, inner, 0, mN), mN).coeff(mN).toZ();
  }
}

