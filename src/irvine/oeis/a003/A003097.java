package irvine.oeis.a003;

import java.util.HashMap;

import irvine.math.group.SymmetricGroup;
import irvine.math.polynomial.CycleIndex;
import irvine.math.polynomial.MultivariateMonomial;
import irvine.math.polynomial.StandardMultiply;
import irvine.math.q.Q;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A003097 Critical connected topologies with n points.
 * @author Sean A. Irvine
 */
public class A003097 implements Sequence {

  private final HashMap<String, CycleIndex> mCache = new HashMap<>();
  private final CycleIndex mSymmetricInfinityApprox = new CycleIndex("S_{\\infty}");
  private int mSymmetricInfinityIndex = 0;

  {
    mSymmetricInfinityApprox.add(new MultivariateMonomial());
  }

  private CycleIndex symInfApprox(final int n) {
    while (mSymmetricInfinityIndex < n) {
      mSymmetricInfinityApprox.add(SymmetricGroup.create(++mSymmetricInfinityIndex).cycleIndex());
    }
    return mSymmetricInfinityApprox;
  }

  private MultivariateMonomial xc(final int c) {
    return MultivariateMonomial.create(c, 1);
  }

  private CycleIndex rPlus(final int c, final int d, final int n) {
    assert c >= 1;
    assert d >= 0;
    if (d == 0) {
      return c == 1 ? new CycleIndex("", MultivariateMonomial.create(1, 1)) : new CycleIndex();
    }
    if (c == 1) {
      return symInfApprox(n).apply(q(2, d - 1, n), n).multiply(xc(1), n);
    }
    final CycleIndex sum = new CycleIndex("mSum(S_m)");
    final CycleIndex r = r(c - 1, d - 1, true, n);
    for (int m = 1; m <= n; ++m) {
      sum.add(SymmetricGroup.create(m).cycleIndex().apply(r, n));
    }
    final CycleIndex q = q(c + 1, d - 1, n);
    return sum.op(StandardMultiply.OP, symInfApprox(n).apply(q, n)).multiply(xc(c), n);
  }

  private CycleIndex rMinus(final int c, final int d, final int n) {
    if (d == 0) {
      return c == 1 ? new CycleIndex() : new CycleIndex("", xc(c));
    }
    if (c == 1) {
      return new CycleIndex("", xc(1));
    }
    return symInfApprox(n).apply(q(c + 1, d - 1, n), n).multiply(xc(c), n);
  }

  private CycleIndex r(final int c, final int d, final boolean side, final int n) {
    assert c >= 1;
    assert d >= 0;
    final String name = "R(" + c + "," + d + "," + (side ? "+" : "-") + ")[" + n + "]";
    final CycleIndex ci = mCache.get(name);
    if (ci != null) {
      return ci;
    }
    final CycleIndex r = side ? rPlus(c, d, n) : rMinus(c, d, n);
    r.setName(name);
    mCache.put(name, r);
    //System.out.println(r);
    return r;
  }

  private CycleIndex q(final int c, final int d, final int n) {
    final String name = "Q(" + c + "," + d + ")[" + n + "]";
    final CycleIndex ci = mCache.get(name);
    if (ci != null) {
      return ci;
    }
    final CycleIndex q = new CycleIndex(name);
    q.add(r(c, d, true, n));
    q.add(r(c, d, false, n));
    mCache.put(name, q);
    return q;
  }

  private CycleIndex rStar(final int c, final int d, final boolean side, final int n) {
    final String name = "R^*(" + c + "," + d + "," + (side ? "+" : "-") + ")[" + n + "]";
    final CycleIndex ci = mCache.get(name);
    if (ci != null) {
      return ci;
    }
    final CycleIndex rStar = new CycleIndex(name);
    rStar.add(r(c, d, side, n));
    if (d > 0) {
      rStar.subtract(r(c, d - 1, side, n));
    }
    mCache.put(name, rStar);
    return rStar;
  }

  private CycleIndex qStar(final int c, final int d, final int n) {
    final String name = "Q^*(" + c + "," + d + ")[" + n + "]";
    final CycleIndex ci = mCache.get(name);
    if (ci != null) {
      return ci;
    }
    final CycleIndex qStar = new CycleIndex(name);
    qStar.add(q(c, d, n));
    if (d > 0) {
      qStar.subtract(q(c, d - 1, n));
    }
    mCache.put(name, qStar);
    return qStar;
  }

  CycleIndex v2(final int v2p1, final int c, final int n) {
    final int v = v2p1 / 2;
    final CycleIndex rStar = rStar(c, v, true, n);
    //System.out.println(rStar);
    final CycleIndex qStar = qStar(c + 1, v, n);
    //System.out.println(qStar);
    final CycleIndex ci = rStar.op(StandardMultiply.OP, qStar, Z.valueOf(n));
    ci.setName("V_{" + v2p1 + "}(" + c + "," + (c + 1) + ")[" + n + "]");
    return ci;
  }

  private CycleIndex l(final int v2, final int c, final int n) {
    final CycleIndex sum = new CycleIndex("mSum(S_m)");
    for (int m = 2; m <= n; ++m) {
      sum.add(SymmetricGroup.create(m).cycleIndex().apply(rStar(c - 1, v2 / 2 - 1, true, n), n));
    }
    return sum.op(StandardMultiply.OP, symInfApprox(n).apply(r(c - 1, v2 / 2 - 2, true, n), n), Z.valueOf(n));
  }

  private CycleIndex lPrime(final int v2, final int c, final int n) {
    return rStar(c - 1, v2 / 2 - 1, true, n).op(StandardMultiply.OP, symInfApprox(n).apply(r(c - 1, v2 / 2 - 2, true, n), n), Z.valueOf(n));
  }

  private CycleIndex lPrimePrime(final int v2, final int c, final int n) {
    final CycleIndex sum = new CycleIndex("sum");
    for (int m = 1; m <= n; ++m) {
      sum.add(SymmetricGroup.create(m).cycleIndex().apply(r(c - 1, v2 / 2 - 2, true, n), n));
    }
    return sum;
  }

  private CycleIndex m(final int v2, final int c, final int n) {
    return symInfApprox(n).apply(q(c + 1, v2 / 2 - 1, n), n);
  }

  private CycleIndex mCalc(final int v2, final int c, final int n, final int start) {
    final CycleIndex sum = new CycleIndex("mSum(S_m)");
    for (int m = start; m <= n; ++m) {
      sum.add(SymmetricGroup.create(m).cycleIndex().apply(qStar(c + 1, v2 / 2 - 1, n), n));
    }
    return sum.op(StandardMultiply.OP, symInfApprox(n).apply(q(c + 1, v2 / 2 - 2, n), n), Z.valueOf(n));
  }

  private CycleIndex mPrime(final int v2, final int c, final int n) {
    return mCalc(v2, c, n, 1);
  }

  private CycleIndex mPrimePrime(final int v2, final int c, final int n) {
    return mCalc(v2, c, n, 2);
  }

  private CycleIndex vv2(final int c, final int n, final String name) {
    assert c >= 1;
    if (c == 1) {
      final CycleIndex res = new CycleIndex(name);
      for (int k = 1; k < n - 1; ++k) {
        final MultivariateMonomial m = MultivariateMonomial.create(1, 1);
        m.add(2, k + 1);
        res.add(m);
      }
      res.setName(name);
      return res;
    }
    if (c > 2) {
      return new CycleIndex(name); // zero
    }
    assert c == 2;
    CycleIndex a = new CycleIndex("a");
    for (int k = 1; k < n; ++k) {
      a.add(MultivariateMonomial.create(1, k + 1));
    }
    final CycleIndex b = new CycleIndex("b");
    b.add(new MultivariateMonomial());
    for (int k = 1; k <= n; ++k) {
      b.add(MultivariateMonomial.create(3, k));
    }
    a = a.op(StandardMultiply.OP, b, Z.valueOf(n));
    final CycleIndex d = new CycleIndex("b");
    for (int k = 1; k <= n; ++k) {
      final MultivariateMonomial m = MultivariateMonomial.create(1, 1);
      m.add(3, k);
      d.add(m);
    }
    a.add(d);
    final CycleIndex res = a.multiply(xc(2), n);
    res.setName(name);
    return res;
  }

  CycleIndex v(final int v2, final int c, final int n) {
    assert v2 >= 0 && (v2 & 1) == 0;
    assert c >= 1;
    final Z zn = Z.valueOf(n);
    final String name = "V_{" + v2 + "}(" + c + ")[" + n + "]";
    if (v2 == 0) {
      if (c == 1) {
        return new CycleIndex(name, MultivariateMonomial.create(1, 1));
      }
      return new CycleIndex(name); // zero
    } else if (v2 == 2) {
      return vv2(c, n, name);
    } else {
      final int v = v2 / 2;
      assert v >= 2;
      if (c == 1) {
        final CycleIndex qStar = qStar(2, v - 1, n);
        CycleIndex sum = new CycleIndex("mSum(S_m)");
        for (int m = 2; m <= n; ++m) {
          sum.add(SymmetricGroup.create(m).cycleIndex().apply(qStar, n));
        }
        sum = sum.op(StandardMultiply.OP, symInfApprox(n).apply(q(2, v - 2, n), n), zn).multiply(xc(1), n);
        sum.setName(name);
        return sum;
      } else {
        CycleIndex l = l(v2, c, n);
        l = l.op(StandardMultiply.OP, m(v2, c, n), zn);
        l.add(lPrime(v2, c, n).op(StandardMultiply.OP, mPrime(v2, c, n), zn));
        l.add(lPrimePrime(v2, c, n).op(StandardMultiply.OP, mPrimePrime(v2, c, n), zn));
        l = l.multiply(xc(c), n);
        l.setName(name);
        return l;
      }
    }
  }


  private int mN = 0;
  private Z mPrev = null;

  @Override
  public Z next() {
    if (mPrev != null) {
      final Z r = mPrev;
      mPrev = null;
      return r;
    }
    ++mN;
    mCache.clear(); // drop them all because no use with lower n anyway
    final CycleIndex topologies = new CycleIndex("topologies");
    final int lim = 2 * mN + 1;
    for (int v = 0; v <= mN; ++v) {
      for (int c = 1; c <= lim; ++c) {
        topologies.add(v(2 * v, c, lim));
        topologies.add(v2(2 * v + 1, c, lim));
      }
    }
    // There is an even/odd thing going on here, so we compute two terms at once to
    // speed up the overall calculation. In fact, computing to mN actually computes
    // all terms of the sequence up to a(2 * mN); but we since we are going
    // incrementally we get only two new terms per iteration.
    Q cntA = Q.ZERO;
    Q cntB = Q.ZERO;
    for (final MultivariateMonomial m : topologies.values()) {
      final int degree = m.totalDegree().intValueExact();
      if (degree == lim) {
        cntA = cntA.add(m.getCoefficient());
      } else if (degree == lim - 1) {
        cntB = cntB.add(m.getCoefficient());
      }
    }
    mPrev = cntA.toZ();
    return cntB.toZ();
  }
}
