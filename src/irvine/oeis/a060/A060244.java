package irvine.oeis.a060;

import irvine.math.group.DegreeLimitedPolynomialRingField;
import irvine.math.group.IntegerField;
import irvine.math.group.PolynomialRingField;
import irvine.math.polynomial.Polynomial;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A060244 Triangle a(n,k) of bipartite partitions of n objects into parts &gt;1, k of which are black.
 * @author Sean A. Irvine
 */
public class A060244 extends Sequence0 {

  private int mN = -1;
  private int mM = 0;
  private Polynomial<Polynomial<Z>> mGf = null;

  private Polynomial<Polynomial<Z>> getGf(final int n) {
    final DegreeLimitedPolynomialRingField<Z> inner = new DegreeLimitedPolynomialRingField<>("y", IntegerField.SINGLETON, n);
    final PolynomialRingField<Polynomial<Z>> ring =  new PolynomialRingField<>(inner);
    Polynomial<Polynomial<Z>> den = ring.one();
    for (int k = 2; k <= n; ++k) {
      for (int j = 0; j <= k; ++j) {
        den = ring.multiply(den, ring.oneMinusXToTheN(inner.monomial(Z.ONE, j), k - j), n);
      }
    }
    return ring.series(ring.one(), den, n);
  }

  @Override
  public Z next() {
    if (++mM > mN) {
      ++mN;
      mM = 0;
      mGf = getGf(mN);
    }
    return mGf.coeff(mN - mM).coeff(mM);
  }
}
