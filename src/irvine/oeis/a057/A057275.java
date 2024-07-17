package irvine.oeis.a057;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import irvine.math.function.Functions;
import irvine.math.group.DegreeLimitedPolynomialRingField;
import irvine.math.polynomial.Polynomial;
import irvine.math.q.Q;
import irvine.math.q.Rationals;
import irvine.math.z.Binomial;
import irvine.math.z.Z;

/**
 * A057275 Triangle T(n,k) of number of unilaterally connected digraphs on n labeled nodes and with k arcs, k=0..n*(n-1).
 * @author Sean A. Irvine
 */
public class A057275 extends A057273 {

  private int mN = 0;
  private int mM = 0;
  private Polynomial<Q> mRow = null;

  private Polynomial<Q> vecsum(final List<Polynomial<Q>> v) {
    Polynomial<Q> sum = RING_Y.zero();
    for (final Polynomial<Q> p : v) {
      sum = RING_Y.add(sum, p);
    }
    return sum;
  }

  private Polynomial<Q> getOrZero(final List<Polynomial<Q>> p, final int n) {
    return n >= p.size() ? RING_Y.zero() : p.get(n);
  }

  private List<Polynomial<Q>> unilaterally(final int nn, final Polynomial<Q> e, final int m) {
    // Take care here to ensure expansions in y are limited to degree m
    final DegreeLimitedPolynomialRingField<Q> inner = new DegreeLimitedPolynomialRingField<>("y", Rationals.SINGLETON, m);
    final Polynomial<Polynomial<Q>> s = strongD(nn, m, e);
    final List<List<Polynomial<Q>>> u = new ArrayList<>();
    u.add(Collections.singletonList(inner.zero())); // n == 0
    for (int n = 1; n <= nn; ++n) {
      final List<Polynomial<Q>> un = new ArrayList<>();
      for (int k = 1; k <= n; ++k) {
        Polynomial<Q> sum;
        if (k == n) {
          sum = inner.one();
        } else {
          sum = inner.zero();
          for (int j = 1; j <= n - k; ++j) {
            final Polynomial<Q> ep = inner.pow(e, (long) k * (n - k - j), m);
            final Polynomial<Q> ep1 = inner.subtract(inner.pow(e, (long) k * j, m), inner.one());
            sum = inner.add(sum, inner.multiply(inner.multiply(ep, ep1, m), getOrZero(u.get(n - k), j - 1)));
          }
        }
        final Polynomial<Q> sk = inner.multiply(s.coeff(k), new Q(Functions.FACTORIAL.z(k)));
        un.add(inner.multiply(inner.multiply(sum, sk, m), new Q(Binomial.binomial(n, k))));
      }
      u.add(un);
    }
    final List<Polynomial<Q>> res = new ArrayList<>();
    for (final List<Polynomial<Q>> t : u) {
      res.add(vecsum(t));
    }
    return res;
  }

  @Override
  public Z next() {
    if (++mM > mN * (mN - 1)) {
      ++mN;
      mM = 0;
      mRow = unilaterally(mN, RING_Y.onePlusXToTheN(1), mN * (mN - 1)).get(mN);
    }
    return mRow.coeff(mM).toZ();
  }
}
