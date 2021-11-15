package irvine.oeis.a004;

import java.util.Map;

import irvine.math.Mobius;
import irvine.math.group.CycleIndexRing;
import irvine.math.group.PolynomialRing;
import irvine.math.polynomial.CycleIndex;
import irvine.math.polynomial.GraphCycleIndex;
import irvine.math.polynomial.MultivariateMonomial;
import irvine.math.polynomial.Polynomial;
import irvine.math.q.Q;
import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.util.Pair;

/**
 * A052436.
 * @author Sean A. Irvine
 */
public class A004115 implements Sequence {

  private static final CycleIndexRing CI = new CycleIndexRing();
  private static final PolynomialRing<CycleIndex> RING = new PolynomialRing<>("y", CI);
  private int mN = 2;

  // todo move to GraphCycleIndex
  private Polynomial<CycleIndex> graphSeries(final int n) {
    final Polynomial<CycleIndex> res = RING.empty();
    for (int k = 0; k <= n; ++k) {
      final CycleIndex hk = GraphCycleIndex.cycleIndex(k);
      hk.setName("");
      res.add(hk);
    }
    return res;
  }

//  private Polynomial<CycleIndex> deriv(final Polynomial<CycleIndex> p, final int index) {
//    final Polynomial<CycleIndex> res = RING.empty();
//    for (final CycleIndex ci : p) {
//      res.add(ci.diff("x", index));
//    }
//    return res;
//  }

  private Polynomial<CycleIndex> sPoint(final Polynomial<CycleIndex> p, final int index) {
    final MultivariateMonomial s = MultivariateMonomial.create(index, Z.ONE);
    final Polynomial<CycleIndex> res = RING.empty();
    for (final CycleIndex ci : p) {
      final CycleIndex t = ci.diff("x", index).multiply(s);
      t.setName(""); // only to make output tidier
      res.add(t);
    }
    return res;
  }

  private Polynomial<CycleIndex> divide(final Polynomial<CycleIndex> a, final Polynomial<CycleIndex> d) {
    // Special purpose divide for a/d assuming b = 1 + ...
    final Polynomial<CycleIndex> res = RING.empty();
    Polynomial<CycleIndex> q = a;
    for (int k = 0; k <= a.degree(); ++k) {
      final CycleIndex c = q.coeff(k);
      res.add(c);
      if (!c.equals(CycleIndex.ZERO)) {
        q = RING.subtract(a, RING.multiply(res, d));
      }
    }
    return res;
  }

  private static final CycleIndex S1NEG1 = new CycleIndex("", MultivariateMonomial.create(1, -1));

  private Polynomial<CycleIndex> divide(final Polynomial<CycleIndex> p, final long d) {
    final Q div = new Q(1, d);
    final Polynomial<CycleIndex> res = RING.empty();
    for (final CycleIndex ci : p) {
      final CycleIndex copy = ci.copy();
      copy.multiply(div);
      res.add(copy);
    }
    return res;
  }

  private Polynomial<CycleIndex> log1p(final Polynomial<CycleIndex> p, final int n) {
    Polynomial<CycleIndex> s = RING.zero();
    for (int k = 1; k <= n; ++k) {
      s = RING.signedAdd((k & 1) == 1, s, divide(RING.pow(p, k, n), k));
    }
    return s;
  }

  private CycleIndex innerSubs(final CycleIndex ci, final int subs, final int degree) {
    final MultivariateMonomial[] terms = new MultivariateMonomial[ci.size()];
    int k = 0;
    for (final MultivariateMonomial t : ci.values()) {
      terms[k] = new MultivariateMonomial();
      terms[k].setCoefficient(t.getCoefficient());
      for (Map.Entry<Pair<String, Integer>, Z> e : t.entrySet()) {
        final int i = e.getKey().right();
        if (i * subs <= degree) {
          terms[k].add(i * subs, e.getValue());
        }
      }
      ++k;
    }
    return new CycleIndex("", terms);
  }

  private Polynomial<CycleIndex> innerSubs(final Polynomial<CycleIndex> p, final int k) {
    final Polynomial<CycleIndex> res = RING.empty();
    for (final CycleIndex ci : p) {
      res.add(innerSubs(ci, k, p.degree()));
    }
    return res;
  }

  private Polynomial<CycleIndex> sLog(final Polynomial<CycleIndex> p) {
    final Polynomial<CycleIndex> log = log1p(RING.subtract(p, RING.one()), p.degree());
    // Substitutions y -> y^k, x_i -> x_{i*k} (up to existing limits)
    Polynomial<CycleIndex> res = RING.zero();
    for (int k = 0; k <= p.degree(); ++k) {
      final int mobius = Mobius.mobius(k);
      if (k != 0) {
        final Polynomial<CycleIndex> subs = divide(innerSubs(log.substitutePower(k, p.degree()), k), k);
        res = RING.signedAdd(mobius == 1, res, subs);
      }
    }
    return res;
  }

  @Override
  public Z next() {
    ++mN;
    System.out.println(GraphCycleIndex.cycleIndex(mN));
    final Polynomial<CycleIndex> g = graphSeries(mN);
    System.out.println("( " + sPoint(g, 1) + " ) / ( " + g + " )");
    final Polynomial<CycleIndex> gcr = divide(sPoint(g, 1), g);
    System.out.println("gcr=" + gcr);
    final Polynomial<CycleIndex> gcrxs1 = RING.multiply(gcr.shift(-1), S1NEG1);
    System.out.println("gcrxs1=" + gcrxs1);
    // sLog( gcr/(x*sv(1)) )
    System.out.println(sLog(gcrxs1));
    return null;
  }
}
