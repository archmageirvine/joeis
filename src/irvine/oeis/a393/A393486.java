package irvine.oeis.a393;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A393486 Triangle read by rows: T(n,k) (0 &lt;= k &lt;= n) such that b(e,e-n) = 2^(e-2n) * Sum_{k=0..n} T(n,k)*binomial(e,k), arising from excess-tail polynomials of row-word inversion clusters on standard Young tableaux of shape (m,m,m).
 * @author Sean A. Irvine
 */
public class A393486 extends Sequence0 {

  // Based on Morten Brydensholt's Python: https://oeis.org/A393486/a393486.py.txt

  private static final class State {
    private final int mA;
    private final int mB;
    private final int mC;

    private State(final int a, final int b, final int c) {
      mA = a;
      mB = b;
      mC = c;
    }

    @Override
    public boolean equals(final Object o) {
      if (!(o instanceof State)) {
        return false;
      }
      final State s = (State) o;
      return mA == s.mA && mB == s.mB && mC == s.mC;
    }

    @Override
    public int hashCode() {
      return (mA * 31 + mB) * 31 + mC;
    }
  }

  private final Map<Integer, Z[]> mDP = new HashMap<>();
  private final Map<Long, Z> mCT = new HashMap<>();
  private int mW = -1;

  private final List<Z> mTri = new ArrayList<>();
  private int mPos = 0;

  private static long key(final int w, final int s) {
    return (((long) w) << 32) | (s & 0xffffffffL);
  }

  private Z[] computeFm3(final int m) {
    Map<State, Map<Integer, Z>> dp = new HashMap<>();
    dp.put(new State(0, 0, 0), singletonPoly(0, Z.ONE));

    for (int step = 0; step < 3 * m; ++step) {
      final Map<State, Map<Integer, Z>> nd = new HashMap<>();
      for (final Map.Entry<State, Map<Integer, Z>> e : dp.entrySet()) {
        final State s = e.getKey();
        for (final Map.Entry<Integer, Z> pe : e.getValue().entrySet()) {
          final int p = pe.getKey();
          final Z ct = pe.getValue();
          if (ct.isZero()) {
            continue;
          }

          if (s.mA < m) {
            add(nd, new State(s.mA + 1, s.mB, s.mC), p + s.mB + s.mC, ct);
          }
          if (s.mB < m && s.mA > s.mB) {
            add(nd, new State(s.mA, s.mB + 1, s.mC), p + s.mC, ct);
          }
          if (s.mC < m && s.mB > s.mC) {
            add(nd, new State(s.mA, s.mB, s.mC + 1), p, ct);
          }
        }
      }
      dp = nd;
    }

    final Map<Integer, Z> poly = dp.get(new State(m, m, m));
    int deg = 0;
    if (poly != null) {
      for (int k : poly.keySet()) {
        deg = Math.max(deg, k);
      }
    }

    final Z[] res = new Z[deg + 1];
    Arrays.fill(res, Z.ZERO);
    if (poly != null) {
      for (final Map.Entry<Integer, Z> e : poly.entrySet()) {
        res[e.getKey()] = e.getValue();
      }
    }
    return res;
  }

  private void ensureDP(final int m) {
    if (!mDP.containsKey(m)) {
      mDP.put(m, computeFm3(m));
    }
  }

  private Map<Integer, Z> singletonPoly(final int k, final Z v) {
    final Map<Integer, Z> m = new HashMap<>();
    m.put(k, v);
    return m;
  }

  private void add(final Map<State, Map<Integer, Z>> dp, final State s, final int p, final Z ct) {
    dp.computeIfAbsent(s, k -> new HashMap<>()).merge(p, ct, Z::add);
  }

  private Z tail(final int m, final int k) {
    ensureDP(m);
    final Z[] c = mDP.get(m);
    final int d = c.length - 1;
    final int idx = d - k;
    return (idx >= 0 && idx < c.length) ? c[idx] : Z.ZERO;
  }

  private Z[][] computeZ(final int bigN, final int bigK) {
    final Z[][] z = new Z[bigN + 1][bigK + 1];
    for (int i = 0; i <= bigN; ++i) {
      Arrays.fill(z[i], Z.ZERO);
    }
    z[0][0] = Z.ONE;

    for (int n = 1; n <= bigN; ++n) {
      for (int k = 0; k <= bigK; ++k) {
        Z v = z[n - 1][k];
        for (final Map.Entry<Long, Z> e : mCT.entrySet()) {
          final int w = (int) (e.getKey() >>> 32);
          final int s = (int) (long) e.getKey();
          if (w <= k && s <= n) {
            v = v.add(z[n - s][k - w].multiply(e.getValue()));
          }
        }
        z[n][k] = v;
      }
    }
    return z;
  }

  private void stepCT() {
    ++mW;
    final int maxN = mW + 2;
    final Z[][] z = computeZ(maxN, mW);
    final Map<Integer, Z> r = new HashMap<>();
    r.put(0, Z.ZERO);

    for (int n = 1; n <= maxN; ++n) {
      r.put(n, tail(n + 1, mW).subtract(z[n][mW]));
    }

    final Map<Integer, Z> f = new HashMap<>();
    f.put(0, Z.ZERO);

    for (int n = 1; n <= mW + 1; ++n) {
      final Z rN = r.get(n);
      final Z rNm1 = r.get(n - 1);
      if (rN != null && rNm1 != null) {
        f.put(n, rN.subtract(rNm1));
      }
    }

    for (int s = 1; s <= mW; ++s) {
      final Z fS = f.get(s);
      final Z fSm1 = f.get(s - 1);
      if (fS != null && fSm1 != null) {
        final Z v = fS.subtract(fSm1);
        if (!v.isZero()) {
          mCT.put(key(mW, s), v);
        }
      }
    }
  }

  private void rebuildTriangle() {
    mTri.clear();
    final Map<Long, Z> bt = new HashMap<>();

    for (int e = 0; e < 12; ++e) {
      final List<Integer> sv = new ArrayList<>();
      final List<Z> yv = new ArrayList<>();

      for (int s = 1; s < 20; ++s) {
        final int w = 3 * s - 2 + e;
        if (w <= mW) {
          sv.add(s);
          yv.add(mCT.getOrDefault(key(w, s), Z.ZERO));
        }
      }

      for (int s0 = 1; s0 < 10; ++s0) {
        final List<Integer> xs = new ArrayList<>();
        final List<Z> ys = new ArrayList<>();
        for (int i = 0; i < sv.size(); i++) {
          if (sv.get(i) >= s0) {
            xs.add(sv.get(i));
            ys.add(yv.get(i));
          }
        }
        if (xs.size() < e + 1) {
          continue;
        }

        final Z[] co = fitPoly(xs, ys, e);
        if (co != null && co[e].equals(Z.ONE.shiftLeft(e))) {
          for (int k = 0; k <= e; k++) {
            bt.put((((long) e) << 32) | k, co[k]);
          }
          break;
        }
      }
    }

    final List<Integer> re = new ArrayList<>();
    for (final long k : bt.keySet()) {
      final int e = (int) (k >>> 32);
      if (bt.getOrDefault((((long) e) << 32) | e, Z.ZERO).equals(Z.ONE.shiftLeft(e))) {
        if (!re.contains(e)) {
          re.add(e);
        }
      }
    }
    Collections.sort(re);

    for (int j = 0; j < 6; ++j) {
      final List<Integer> ev = new ArrayList<>();
      for (final int e : re) {
        if (e >= j && bt.containsKey((((long) e) << 32) | (e - j))) {
          ev.add(e);
        }
      }
      if (ev.size() < j + 1) {
        break;
      }

      final int n = ev.size();
      final Z[][] aug = new Z[n][j + 2];

      for (int i = 0; i < n; ++i) {
        final int e = ev.get(i);
        Z val = bt.get((((long) e) << 32) | (e - j));
        if (e < 2 * j) {
          val = val.multiply(Z.ONE.shiftLeft(2 * j - e));
        } else {
          val = val.divide(Z.ONE.shiftLeft(e - 2 * j));
        }

        for (int r = 0; r <= j; ++r) {
          aug[i][r] = Binomial.binomial(e, r);
        }
        aug[i][j + 1] = val;
      }

      gauss(aug, j + 1);

      for (int i = 0; i <= j; i++) {
        mTri.add(aug[i][j + 1].divide(aug[i][i]));
      }
    }
  }

  private Z[] fitPoly(final List<Integer> sv, final List<Z> yv, final int deg) {
    final int n = sv.size();
    final int c = deg + 1;
    if (n < c) {
      return null;
    }

    final Z[][] aug = new Z[n][c + 1];
    for (int i = 0; i < n; ++i) {
      for (int k = 0; k < c; ++k) {
        aug[i][k] = Binomial.binomial(sv.get(i) - 2, k);
      }
      aug[i][c] = yv.get(i);
    }

    if (!gauss(aug, c)) {
      return null;
    }

    final Z[] co = new Z[c];
    for (int i = 0; i < c; ++i) {
      co[i] = aug[i][c].divide(aug[i][i]);
    }

    return co;
  }

  private boolean gauss(final Z[][] a, final int cols) {
    final int n = a.length;
    for (int col = 0; col < cols; ++col) {
      int piv = -1;
      for (int r = col; r < n; ++r) {
        if (!a[r][col].isZero()) {
          piv = r;
          break;
        }
      }
      if (piv == -1) {
        return false;
      }
      final Z[] tmp = a[col];
      a[col] = a[piv];
      a[piv] = tmp;

      for (int r = 0; r < n; ++r) {
        if (r != col && !a[r][col].isZero()) {
          final Z f = a[r][col];
          final Z g = a[col][col];
          for (int j = col; j < a[r].length; j++) {
            a[r][j] = a[r][j].multiply(g).subtract(f.multiply(a[col][j]));
          }
        }
      }
    }
    return true;
  }

  private void extendTriangle() {
    final int targetW = Math.max(mW + 5, 3 * mTri.size());
    while (mW < targetW) {
      stepCT();
    }
    rebuildTriangle();
  }

  @Override
  public Z next() {
    while (mPos >= mTri.size()) {
      extendTriangle();
    }
    return mTri.get(mPos++);
  }
}
