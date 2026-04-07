package irvine.oeis.a394;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A394326 Total number of connected defect cluster types of weight n in the span-stratified cluster expansion for the row-word inversion statistic on standard Young tableaux of shape (m,m,m).
 * @author Sean A. Irvine
 */
public class A394326 extends Sequence1 {

  // Based on Morten Brydensholt's Python: https://oeis.org/A394326/a394326.py.txt

  private final Map<Integer, Z[]> mDP = new HashMap<>();
  private final Map<Integer, Z> mCT = new HashMap<>();
  private int mW = 0;

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

  private void ensureDP(final int m) {
    if (!mDP.containsKey(m)) {
      mDP.put(m, computeFm3(m));
    }
  }
  private Z[] computeFm3(final int m) {
    Map<State, Map<Integer, Z>> dp = new HashMap<>();
    dp.put(new State(0, 0, 0), singletonPoly(0, Z.ONE));

    for (int step = 0; step < 3 * m; ++step) {
      final Map<State, Map<Integer, Z>> newDp = new HashMap<>();
      for (Map.Entry<State, Map<Integer, Z>> e : dp.entrySet()) {
        final State s = e.getKey();
        for (Map.Entry<Integer, Z> pe : e.getValue().entrySet()) {
          final int power = pe.getKey();
          final Z count = pe.getValue();
          if (count.isZero()) {
            continue;
          }
          if (s.mA < m) {
            add(newDp, new State(s.mA + 1, s.mB, s.mC), power + s.mB + s.mC, count);
          }
          if (s.mB < m && s.mA > s.mB) {
            add(newDp, new State(s.mA, s.mB + 1, s.mC), power + s.mC, count);
          }
          if (s.mC < m && s.mB > s.mC) {
            add(newDp, new State(s.mA, s.mB, s.mC + 1), power, count);
          }
        }
      }
      dp = newDp;
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

  private Map<Integer, Z> singletonPoly(final int k, final Z v) {
    final Map<Integer, Z> m = new HashMap<>();
    m.put(k, v);
    return m;
  }

  private void add(final Map<State, Map<Integer, Z>> dp, final State s, final int power, final Z count) {
    final Map<Integer, Z> poly = dp.computeIfAbsent(s, k -> new HashMap<>());
    poly.merge(power, count, Z::add);
  }

  private Z tail(final int m, final int k) {
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
        for (final Map.Entry<Integer, Z> e : mCT.entrySet()) {
          final int key = e.getKey();
          final int w = key >>> 16;
          final int s = key & 0xFFFF;
          final Z c = e.getValue();
          if (w <= k && s <= n) {
            v = v.add(z[n - s][k - w].multiply(c));
          }
        }
        z[n][k] = v;
      }
    }

    return z;
  }

  @Override
  public Z next() {
    ++mW;

    final int maxN = mW + 2;
    final Z[][] z = computeZ(maxN, mW);
    final Map<Integer, Z> r = new HashMap<>();
    r.put(0, Z.ZERO);
    for (int n = 1; n <= maxN; ++n) {
      ensureDP(n + 1);
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
          mCT.put((mW << 16) | s, v);
        }
      }
    }

    Z sum = Z.ZERO;
    for (int s = 1; s <= mW; ++s) {
      sum = sum.add(mCT.getOrDefault((mW << 16) | s, Z.ZERO));
    }
    return sum;
  }
}
