package irvine.oeis.a371;

import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;

import irvine.math.MemoryFunctionInt2;
import irvine.math.q.Q;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;
import irvine.util.Pair;

/**
 * A371949 Array read by antidiagonals: T(n,k) is the numerator of the probability of attacker victory in the game of Risk when n attacking armies face k defending armies in a territory.
 * @author Sean A. Irvine
 */
public class A371949 extends Sequence1 {

  // After Python

  private static final int DICE = 5;
  private static final Z DEN = Z.SIX.pow(DICE);
  private int mN = 0;
  private int mM = -1;

  private static int[] getElims(final int[] a, final int[] d) {
    final int[] a2 = maxTwo(a);
    final int[] d2 = maxTwo(d);
    int dc = 0;
    int ac = 0;
    for (int j = a2.length - 1, i = d2.length - 1; j >= 0 && i >= 0; --j, --i) {
      if (a2[j] > d2[i]) {
        --dc;
      } else {
        --ac;
      }
    }
    return new int[] {ac, dc};
  }

  private static int[] maxTwo(final int[] a) {
    if (a.length <= 1) {
      return a;
    }
    // Find two largest elements
    int m0 = Integer.MIN_VALUE;
    int m1 = Integer.MIN_VALUE;
    for (final int v : a) {
      if (v >= m1) {
        m0 = m1;
        m1 = v;
      } else if (v > m0) {
        m0 = v;
      }
    }
    return new int[] {m0, m1};
  }

  private final MemoryFunctionInt2<Map<Pair<Integer, Integer>, Q>> mElimP = new MemoryFunctionInt2<>() {
    @Override
    protected Map<Pair<Integer, Integer>, Q> compute(final int attack, final int defend) {
      final Map<Pair<Integer, Integer>, Integer> counter = new HashMap<>();
      final int[] dice = new int[DICE];
      for (int a = 1; a <= 6; ++a) {
        dice[0] = a;
        for (int b = 1; b <= 6; ++b) {
          dice[1] = b;
          for (int c = 1; c <= 6; ++c) {
            dice[2] = c;
            for (int d = 1; d <= 6; ++d) {
              dice[3] = d;
              for (int e = 1; e <= 6; ++e) {
                dice[4] = e;
                final int[] aa = Arrays.copyOfRange(dice, 0, attack);
                final int[] dd = Arrays.copyOfRange(dice, attack, attack + defend);
                final int[] r = getElims(aa, dd);
                counter.merge(new Pair<>(r[0], r[1]), 1, Integer::sum);
              }
            }
          }
        }
      }
      final Map<Pair<Integer, Integer>, Q> out = new HashMap<>();
      for (final Map.Entry<Pair<Integer, Integer>, Integer> e : counter.entrySet()) {
        out.put(e.getKey(), new Q(e.getValue(), DEN));
      }
      return out;
    }
  };

  private final MemoryFunctionInt2<Map<Pair<Integer, Integer>, Q>> mResP = new MemoryFunctionInt2<>() {
    @Override
    protected Map<Pair<Integer, Integer>, Q> compute(final int attack, final int defend) {
      final Map<Pair<Integer, Integer>, Q> base = mElimP.get(Math.min(3, attack), Math.min(2, defend));
      final Map<Pair<Integer, Integer>, Q> out = new HashMap<>();
      for (final Map.Entry<Pair<Integer, Integer>, Q> e : base.entrySet()) {
        final Pair<Integer, Integer> key = e.getKey();
        final int aa = key.left();
        final int da = key.right();
        out.put(new Pair<>(attack + aa, defend + da), e.getValue());
      }
      return out;
    }
  };

  private Map<Pair<Integer, Integer>, Q> getFinalResult(final int attack, final int defend) {
    final HashMap<Pair<Integer, Integer>, Q> d = new HashMap<>();
    final LinkedList<Pair<Integer, Integer>> g = new LinkedList<>();
    final Pair<Integer, Integer> start = new Pair<>(attack, defend);
    d.put(start, Q.ONE);
    g.add(start);
    while (!g.isEmpty()) {
      final Pair<Integer, Integer> w = g.poll();
      final Q p = d.remove(w);
      if (w.left() == 0 || w.right() == 0 || p == null) {
        continue;
      }
      for (final Map.Entry<Pair<Integer, Integer>, Q> e : mResP.get(w.left(), w.right()).entrySet()) {
        final Pair<Integer, Integer> key = e.getKey();
        d.merge(key, e.getValue().multiply(p), Q::add);
        if (key.left() > 0 && key.right() > 0) {
          g.add(key);
        }
      }
    }
    return d;
  }

  protected Q t(final int attack, final int defend) {
    final Map<Pair<Integer, Integer>, Q> r = getFinalResult(attack, defend);
    Q total = Q.ZERO;
    for (final Map.Entry<Pair<Integer, Integer>, Q> e : r.entrySet()) {
      if (e.getKey().left() > e.getKey().right()) {
        total = total.add(e.getValue());
      }
    }
    return total;
  }

  private Z u(final int attack, final int defend) {
    return t(attack, defend).multiply(DEN.pow(attack + defend - 1)).toZ();
  }

  @Override
  public Z next() {
    if (++mM > mN) {
      ++mN;
      mM = 0;
    }
    return u(mM + 1, mN - mM + 1);
  }
}

