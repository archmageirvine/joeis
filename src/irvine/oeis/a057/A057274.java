package irvine.oeis.a057;

import java.util.ArrayList;
import java.util.List;

import irvine.math.factorial.MemoryFactorial;
import irvine.math.group.DegreeLimitedPolynomialRingField;
import irvine.math.polynomial.Polynomial;
import irvine.math.q.Q;
import irvine.math.q.Rationals;
import irvine.math.z.Binomial;
import irvine.math.z.Z;

/**
 * A057274 Triangle T(n,k) of the number of digraphs with a source on n labeled nodes with k arcs, k=0..n*(n-1).
 * @author Sean A. Irvine
 */
public class A057274 extends A057273 {

  private int mN = 0;
  private int mM = 0;
  private Polynomial<Q> mRow = null;

  protected List<Polynomial<Q>> lambda(final int t, final int n, final Polynomial<Q> e, final int m) {
    final List<Polynomial<Q>> v = new ArrayList<>();
    for (int k = 0; k <= n; ++k) {
      Polynomial<Q> ep = RING_Y.pow(e, k * (k + t - 1), m);
      for (int j = 0; j < k; ++j) {
        ep = RING_Y.subtract(ep, RING_Y.multiply(RING_Y.multiply(RING_Y.pow(e, (k - 1) * (k - j), m), new Q(Binomial.binomial(k, j))), v.get(j), m));
      }
      v.add(ep);
    }
    //System.out.println("lambda(" + t + "," + n + "," + e + ")=" + v);
    return v;
  }

  private List<Polynomial<Q>> initially(final int n, final Polynomial<Q> e, final int m) {
    // Take care here to ensure expansions in y are limited to degree m
    final DegreeLimitedPolynomialRingField<Q> inner = new DegreeLimitedPolynomialRingField<>("y", Rationals.SINGLETON, m);
    final Polynomial<Polynomial<Q>> s = strongD(n, m, e);
    final ArrayList<Polynomial<Q>> v = new ArrayList<>();
    for (int k = 0; k <= n; ++k) {
      v.add(inner.zero());
    }
    for (int k = 1; k <= n; ++k) {
      final List<Polynomial<Q>> u = lambda(k, n - k, e, m);
      final Polynomial<Q> sk = inner.multiply(s.coeff(k), new Q(MemoryFactorial.SINGLETON.factorial(k)));
      for (int j = k; j <= n; ++j) {
        final Polynomial<Q> t = inner.multiply(inner.multiply(sk, u.get(j - k), m), new Q(Binomial.binomial(j, k)));
        v.set(j, inner.add(v.get(j), t));
      }
    }
    return v;
  }

  @Override
  public Z next() {
    if (++mM > mN * (mN - 1)) {
      ++mN;
      mM = 0;
      mRow = initially(mN, RING_Y.onePlusXToTheN(1), mN * (mN - 1)).get(mN);
    }
    return mRow.coeff(mM).toZ();
  }
}
