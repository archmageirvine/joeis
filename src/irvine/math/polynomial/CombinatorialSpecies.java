package irvine.math.polynomial;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import irvine.math.Mobius;
import irvine.math.group.CycleIndexRing;
import irvine.math.group.PolynomialRing;
import irvine.math.group.PolynomialRingField;
import irvine.math.q.Q;
import irvine.math.q.Rationals;
import irvine.math.z.Z;
import irvine.util.Pair;

/**
 * Routines related to cycle indices and combinatorial species.
 * @author Sean A. Irvine
 */
public final class CombinatorialSpecies {

  // A lot of this class is based on routines developed by Andrew Howroyd
  // see https://oeis.org/A339645/a339645_1.txt

  private CombinatorialSpecies() {
  }

  private static final CycleIndexRing CI = new CycleIndexRing();
  /** Ring for species computations. */
  public static final PolynomialRing<CycleIndex> RING = new PolynomialRing<>("y", CI);
  private static final MultivariateMonomial X1 = MultivariateMonomial.create(1, 1);

  /**
   * Compute a polynomial of cycle indices for graphs of given order.
   * @param n order of graphs
   * @return cycle index polynomial
   */
  public static Polynomial<CycleIndex> graphSeries(final int n) {
    final Polynomial<CycleIndex> res = RING.empty();
    for (int k = 0; k <= n; ++k) {
      final CycleIndex hk = GraphCycleIndex.cycleIndex(k);
      hk.setName("");
      res.add(hk);
    }
    return res;
  }

  /**
   * Point combinatorial class (rooted objects from non-rooted objects).
   * @param p species
   * @param index index
   * @return species <code>^p</code>
   */
  public static Polynomial<CycleIndex> sPoint(final Polynomial<CycleIndex> p, final int index) {
    final MultivariateMonomial s = MultivariateMonomial.create(index, Z.ONE);
    final Polynomial<CycleIndex> res = RING.empty();
    for (final CycleIndex ci : p) {
      final CycleIndex t = ci.diff("x", index).multiply(s);
      t.setName(""); // only to make output tidier
      res.add(t);
    }
    return res;
  }

  /**
   * Divide a combinatorial species by a constant.
   * @param p species
   * @param d constant
   * @return species
   */
  public static Polynomial<CycleIndex> divide(final Polynomial<CycleIndex> p, final long d) {
    final Q div = new Q(1, d);
    final Polynomial<CycleIndex> res = RING.empty();
    for (final CycleIndex ci : p) {
      ci.multiply(div);
      res.add(ci);
    }
    return res;
  }

  /**
   * Divide a combinatorial species by another. WARNING: This only works in restricted circumstances.
   * @param a species
   * @param d species
   * @return species
   */
  public static Polynomial<CycleIndex> divide(final Polynomial<CycleIndex> a, final Polynomial<CycleIndex> d) {
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

  private static Polynomial<CycleIndex> log1p(final Polynomial<CycleIndex> p, final int n) {
    Polynomial<CycleIndex> s = RING.zero();
    for (int k = 1; k <= n; ++k) {
      s = RING.signedAdd((k & 1) == 1, s, divide(RING.pow(p, k, n), k));
    }
    return s;
  }

  private static CycleIndex innerSubs(final CycleIndex ci, final int subs, final int lim) {
    final MultivariateMonomial[] terms = new MultivariateMonomial[ci.size()];
    int k = 0;
    for (final MultivariateMonomial t : ci.values()) {
      terms[k] = new MultivariateMonomial();
      terms[k].setCoefficient(t.getCoefficient());
      for (Map.Entry<Pair<String, Integer>, Z> e : t.entrySet()) {
        final int i = e.getKey().right();
        if (i <= lim) {
          terms[k].add(i * subs, e.getValue());
        } else {
          terms[k] = MultivariateMonomial.ZERO;
          break;
        }
      }
      ++k;
    }
    return new CycleIndex("", terms);
  }

  private static Polynomial<CycleIndex> innerSubs(final Polynomial<CycleIndex> p, final int k, final int lim) {
    final Polynomial<CycleIndex> res = RING.empty();
    for (final CycleIndex ci : p) {
      res.add(CombinatorialSpecies.innerSubs(ci, k, lim));
    }
    return res;
  }

  /**
   * Logarithm transform (inverse of exponential).
   * @param p species
   * @return log of species
   */
  public static Polynomial<CycleIndex> sLog(final Polynomial<CycleIndex> p) {
    final Polynomial<CycleIndex> log = log1p(RING.subtract(p, RING.one()), p.degree());
    // Substitutions y -> y^k, x_i -> x_{i*k} (up to existing limits)
    Polynomial<CycleIndex> res = RING.zero();
    for (int k = 1; k <= p.degree(); ++k) {
      final int mobius = Mobius.mobius(k);
      if (mobius != 0) {
        final Polynomial<CycleIndex> subs = divide(innerSubs(log.substitutePower(k, p.degree()), k , p.degree() / k), k);
        res = RING.signedAdd(mobius == 1, res, subs);
      }
    }
    return res;
  }

  private static Polynomial<CycleIndex> specialSubs(final CycleIndex t, final List<Polynomial<CycleIndex>> f, final int n) {
    Polynomial<CycleIndex> res = RING.empty();
    for (final MultivariateMonomial m : t.values()) {
      final Q coeff = m.getCoefficient();
      final CycleIndex u = CycleIndex.ONE.copy();
      u.multiply(coeff);
      Polynomial<CycleIndex> r = RING.monomial(u, 0);
      for (Map.Entry<Pair<String, Integer>, Z> e : m.entrySet()) {
        final int i = e.getKey().right();
        if (i <= n) {
          r = RING.multiply(r, RING.pow(f.get(i - 1), e.getValue().intValueExact(), n), n);
        }
      }
      res = RING.add(res, r);
    }
    return res;
  }

  /**
   * Inverse substitution.
   * @param z species
   * @param b species
   * @return species <code>a</code> such that <code>z=a(b)</code>
   */
  public static Polynomial<CycleIndex> sSolve(Polynomial<CycleIndex> z, final Polynomial<CycleIndex> b) {
    //StringUtils.message("Starting solve");
    final Polynomial<CycleIndex> bb = RING.create(b);
    bb.set(0, CycleIndex.ZERO); // bb = b - [x^0] b
    int m = z.degree();
    final int n = Math.min(bb.size(), m);
    if (m > n) {
      m = n;
    }
    // valid variables are x1, ..., xn
    final List<Polynomial<CycleIndex>> f = new ArrayList<>(Math.max(m, 0));
    for (int k = 1; k <= m; ++k) {
      f.add(innerSubs(b.substitutePower(k, n), k, n / k).shift(-k));
    }
    //StringUtils.message("Finished computation of f vector");
    final Q b1 = b.coeff(1).get(X1.termKey()).getCoefficient();
    final Polynomial<CycleIndex> r = RING.empty();
    r.add(z.coeff(0));
    for (int i = 1; i <= n; ++i) {
      final CycleIndex t = z.coeff(i).copy();
      t.multiply(b1.reciprocal());
      r.add(t);
      z = RING.subtract(z, specialSubs(t, f, n - i).shift(i));
      //StringUtils.message("Done " + i + "/" + n + " deg(Z)=" + z.degree());
    }
    return r;
  }

  /**
   * Formal integral with respect to a cycle index variable.
   * @param p species
   * @param variable cycle index variable number
   * @return formal integral
   */
  public static Polynomial<CycleIndex> integrate(final Polynomial<CycleIndex> p, final int variable) {
    final Polynomial<CycleIndex> res = RING.empty();
    for (final CycleIndex ci : p) {
      res.add(ci.integrate(variable));
    }
    return res;
  }

  /**
   * Drop all terms containing the specified cycle index variable.
   * @param p species
   * @param variable variable index to drop
   * @return species with all terms involving specified variable dropped
   */
  public static Polynomial<CycleIndex> drop(final Polynomial<CycleIndex> p, final int variable) {
    final Polynomial<CycleIndex> res = RING.empty();
    for (final CycleIndex ci : p) {
      res.add(ci.drop(variable));
    }
    return res;
  }

  private static final PolynomialRingField<Q> POLY = new PolynomialRingField<>(Rationals.SINGLETON);

  /**
   * Evaluate the species with 1 in every variable.
   * @param p species
   * @return evaluation
   */
  public static Polynomial<Q> eval1(final Polynomial<CycleIndex> p) {
    final Polynomial<Q> res = POLY.empty();
    for (final CycleIndex c : p) {
      res.add(c.eval(1));
    }
    return res;
  }
}
