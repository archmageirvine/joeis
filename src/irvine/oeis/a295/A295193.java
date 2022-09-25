package irvine.oeis.a295;

import java.util.HashMap;
import java.util.Map;
import java.util.function.BiFunction;

import irvine.math.group.PolynomialRing;
import irvine.math.polynomial.Polynomial;
import irvine.math.z.Binomial;
import irvine.math.z.Integers;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A295193 Number of regular simple graphs on n labeled nodes.
 * @author Sean A. Irvine
 */
public class A295193 implements Sequence {

  // After Andrew Howroyd

  private static final PolynomialRing<Z> RING = new PolynomialRing<>(Integers.SINGLETON);
  private int mN = 0;

  protected static int valuation(final Polynomial<Z> p) {
    if (p.equals(RING.zero())) {
      throw new IllegalArgumentException();
    }
    int k = 0;
    while (p.coeff(k).isZero()) {
      ++k;
    }
    return k;
  }

  private void acc(final Map<Polynomial<Z>, Z> m, final Polynomial<Z> p, final Z v) {
    final Z existing = m.get(p);
    if (existing == null) {
      m.put(p, v);
    } else {
      m.put(p, existing.add(v));
    }
  }

  private void recurse(final Map<Polynomial<Z>, Z> m, final int limit, final BiFunction<Polynomial<Z>, Integer, Boolean> fok, final int r, final Polynomial<Z> p, final int i, final Polynomial<Z> q, final Z v, final int e) {
    if (e <= limit && q.degree() <= limit) {
      if (i < 0) {
        final Polynomial<Z> qe = RING.add(q, RING.monomial(Z.ONE, e));
        if (fok.apply(qe, r)) {
          acc(m, qe, v);
        }
      } else {
        final int t = p.coeff(i).intValueExact();
        for (int k = 0; k <= t; ++k) {
          recurse(m, limit, fok, r, p, i - 1, RING.add(Polynomial.create(t - k, k).shift(i), q), Binomial.binomial(t, k).multiply(v), e + k);
        }
      }
    }
  }

  // Accumulates the number of labeled graphs by degree sequence.
  // Each degree sequence is represented as a polynomial.
  // For example 5*x^3 + x represents a graph with 5 nodes of degree 3 and 1 node of degree 1.
  // The limit parameter restricts to graphs with maximum vertex degree of limit.
  // The fok parameter is a boolean function on (p,r) where p is a degree sequence
  // and r is the number of nodes which have not yet been decided and returns 1
  // if the degree sequence should be retained. Otherwise, it is pruned.
  // Use of limit and fok parameters can significantly reduce memory and time requirements.
  protected Map<Polynomial<Z>, Z> graphsByDegreeSeq(final int n, final int limit, final BiFunction<Polynomial<Z>, Integer, Boolean> fok) {
    Map<Polynomial<Z>, Z> m = new HashMap<>();
    m.put(RING.one(), Z.ONE);
    for (int k = 2; k <= n; ++k) {
      final Map<Polynomial<Z>, Z> src = m;
      m = new HashMap<>();
      for (final Map.Entry<Polynomial<Z>, Z> i : src.entrySet()) {
        final Polynomial<Z> p = i.getKey();
        recurse(m, limit, fok, n - k, p, p.degree(), RING.zero(), i.getValue(), 0);
      }
    }
    return m;
  }

  @Override
  public Z next() {
    final Map<Polynomial<Z>, Z> m = graphsByDegreeSeq(++mN, (mN - 1) / 2, (p, r) -> p.degree() - valuation(p) <= r);
    Z sum = Z.ZERO;
    for (final Map.Entry<Polynomial<Z>, Z> e : m.entrySet()) {
      final Polynomial<Z> p = e.getKey();
      if (p.leadingCoeff().intValueExact() == mN) {
        sum = sum.add(e.getValue().multiply(2 * p.degree() == mN - 1 ? 1 : 2));
      }
    }
    return sum;
  }
}
