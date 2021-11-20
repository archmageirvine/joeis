package irvine.oeis.a004;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import irvine.math.Mobius;
import irvine.math.group.CycleIndexRing;
import irvine.math.group.PolynomialRing;
import irvine.math.group.PolynomialRingField;
import irvine.math.polynomial.CycleIndex;
import irvine.math.polynomial.GraphCycleIndex;
import irvine.math.polynomial.MultivariateMonomial;
import irvine.math.polynomial.Polynomial;
import irvine.math.q.Q;
import irvine.math.q.Rationals;
import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.util.Pair;

/**
 * A004115 Number of unlabeled rooted nonseparable graphs with n nodes.
 * @author Sean A. Irvine
 */
public class A004115 implements Sequence {

  private static final CycleIndexRing CI = new CycleIndexRing();
  private static final PolynomialRing<CycleIndex> RING = new PolynomialRing<>("y", CI);
  private static final MultivariateMonomial X1 = MultivariateMonomial.create(1, 1);
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

  private CycleIndex innerSubs(final CycleIndex ci, final int subs, final int lim) {
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
          // todo is this right?
          terms[k] = MultivariateMonomial.ZERO;
          break;
        }
      }
      ++k;
    }
    return new CycleIndex("", terms);
  }

  private Polynomial<CycleIndex> innerSubs(final Polynomial<CycleIndex> p, final int k, final int lim) {
    final Polynomial<CycleIndex> res = RING.empty();
    for (final CycleIndex ci : p) {
      res.add(innerSubs(ci, k, lim));
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
        final Polynomial<CycleIndex> subs = divide(innerSubs(log.substitutePower(k, p.degree()), k , p.degree() / k), k);
        res = RING.signedAdd(mobius == 1, res, subs);
      }
    }
    return res;
  }

  private Polynomial<CycleIndex> specialSubs(final CycleIndex t, final List<Polynomial<CycleIndex>> f, final int n) {
    // substvec(t + X, vars[1..i], vector(i,j,f[j] + X)
    //System.out.println("specialSubs: t=" + t + " n=" + n + " f=" + f);
    Polynomial<CycleIndex> res = RING.empty();
    for (final MultivariateMonomial m : t.values()) {
      Polynomial<CycleIndex> r = RING.one();
      for (Map.Entry<Pair<String, Integer>, Z> e : m.entrySet()) {
        final int i = e.getKey().right();
        if (i <= n) {
          r = RING.multiply(r, RING.pow(f.get(i - 1), e.getValue().intValueExact()));
        }
      }
      final CycleIndex u = CycleIndex.ONE.copy();
      u.multiply(m.getCoefficient());
      r = RING.multiply(r, u);
      res = RING.add(res, r);
    }
    return res;
  }

  /*
  \\ Inverse of sSubstOp.
\\ Returns species A such that Z=A(B).
sSolve(Z, B)={
  B -= polcoeff(B,0);
  my(m=serprec(Z,x)-1, n=serprec(B,x));
  if(n==oo, n=m, n=min(m, n-1));
  if(m > n, m=n);
  my(vars=vector(n, i, sv(i)));
  my(f=vector(m, k, xsubstvec(B + O(x*x^(n\k)), concat([x, 'y], vars[1..n\k]), concat([x^k, 'y^k], vector(n\k, i, vars[i*k])))/x^k ));
  my(b1=polcoeff(polcoeff(B,1,x), 1, sv(1)));
  my(r=polcoeff(Z,0,x));
  for(i=1, n, my(t=polcoeff(Z,i,x)/b1); r += t*x^i;
     \\      Z-=x^i*xsubstvec(t + O(x^(n-i+1)), vars[1..i], f[1..i])
     \\ Faster version of above (in v2.11.1 of PARI)
     my(X=O(x^(n-i+1))); Z-=x^i*substvec(t + X, vars[1..i], vector(i,j,f[j] + X))
  );
  r + O(x*x^n);
}
   */

  private Polynomial<CycleIndex> sSolve(Polynomial<CycleIndex> z, final Polynomial<CycleIndex> b) {
    final Polynomial<CycleIndex> bb = RING.create(b);
    bb.set(0, CycleIndex.ZERO); // bb = b - [x^0] b
    int m = z.degree();
    final int n = Math.min(bb.size(), m);
    if (m > n) {
      m = n;
    }
    // valid variables are x1, ..., xn
    // f=vector(m, k, xsubstvec(B + O(x*x^(n\k)), concat([x, 'y], vars[1..n\k]), concat([x^k, 'y^k], vector(n\k, i, vars[i*k])))/x^k ))
    final List<Polynomial<CycleIndex>> f = new ArrayList<>(m);
    for (int k = 1; k <= m; ++k) {
      f.add(innerSubs(b.substitutePower(k, n), k, n / k).shift(-k));
    }
    System.out.println("f=" + f + " n=" + n);
    final Q b1 = b.coeff(1).get(X1.termKey()).getCoefficient();
    System.out.println("b1=" + b1);
    final Polynomial<CycleIndex> r = RING.empty();
    r.add(z.coeff(0));
    for (int i = 1; i <= n; ++i) {
      final CycleIndex t = z.coeff(i).copy();
      t.multiply(b1.reciprocal());
      r.add(t);
      //System.out.println("SUBS: " + specialSubs(t, f, i)); //.truncate(n - i).shift(i));
      z = RING.subtract(z, specialSubs(t, f, i).truncate(n - i).shift(i));
    }
    return r;
  }

  private static final PolynomialRingField<Q> POLY = new PolynomialRingField<>(Rationals.SINGLETON);

  private Polynomial<Q> apply(final Polynomial<CycleIndex> p) {
    final Polynomial<Q> res = POLY.empty();
    for (final CycleIndex c : p) {
      res.add(c.eval(1));
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
    final Polynomial<CycleIndex> log = sLog(gcrxs1);
    System.out.println("log=" + log);
    final Polynomial<CycleIndex> solve = sSolve(log, gcr);
    System.out.println(solve); // technically should *x
    System.out.println(apply(solve));
    return apply(solve).coeff(mN - 1).toZ();
  }
}

/*
cycleIndexSeries(n)={my(g=graphsSeries(n), gcr=sPoint(g)/g); x*sSolve( sLog( gcr/(x*sv(1)) ), gcr )}
 */
