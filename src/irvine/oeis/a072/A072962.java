package irvine.oeis.a072;

import irvine.math.function.Functions;
import irvine.math.group.DegreeLimitedPolynomialRingField;
import irvine.math.group.PolynomialRingField;
import irvine.math.polynomial.Polynomial;
import irvine.math.q.Q;
import irvine.math.q.Rationals;
import irvine.math.z.Binomial;
import irvine.math.z.Integers;
import irvine.math.z.Z;
import irvine.oeis.Sequence2;

/**
 * A072962 Unsigned reduced Euler characteristic for the matroid complex of cycle matroid for complete bipartite graph K_{n,n}.
 * @author Sean A. Irvine
 */
public class A072962 extends Sequence2 {

  private int mN = 1;

  private Polynomial<Polynomial<Q>> w(final int n, final int m) {
    final PolynomialRingField<Q> inner = new DegreeLimitedPolynomialRingField<>("y", Rationals.SINGLETON, m);
    final PolynomialRingField<Polynomial<Q>> ring = new PolynomialRingField<>("x", inner);
    Polynomial<Polynomial<Q>> poly = ring.zero();
    for (int k = 1; k <= n; ++k) {
      Q[] row = new Q[m + 1];
      row[0] = Q.ZERO;
      for (int j = 1; j <= m; ++j) {
        row[j] = new Q(Z.valueOf(k).pow(j - 1).multiply(Z.valueOf(j).pow(k - 1).multiply(j - 1)),
          Functions.FACTORIAL.z(j).multiply(Functions.FACTORIAL.z(k)));
      }
      poly = ring.add(poly, ring.monomial(Polynomial.create(row), k));
    }
    return ring.exp(poly, n);
  }

  private Z a(final int s, final int t) {
    final Polynomial<Polynomial<Q>> w = w(s, t);
    return Integers.SINGLETON.sum(0, s - 2, k -> Z.NEG_ONE.pow(k).multiply(Binomial.binomial(s - 1, k))
      .multiply(w.coeff(s - 1 - k).coeff(t).multiply(Functions.FACTORIAL.z(s - 1 - k)).multiply(Functions.FACTORIAL.z(t)).toZ()));
  }

  @Override
  public Z next() {
    return a(++mN, mN);
  }
}

