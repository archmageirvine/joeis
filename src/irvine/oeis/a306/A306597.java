package irvine.oeis.a306;

import java.util.Map;
import java.util.Set;
import java.util.SortedMap;
import java.util.SortedSet;
import java.util.TreeMap;
import java.util.TreeSet;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A306597 <code>a(n) = Card({ Sum_{k=1..n}(x_k * k) : (x_k)_{k=1..n}</code> is an n-tuple of nonnegative integers such that <code>Sum_{k=1..n}(x_k * T_k) = T_n })</code>, where <code>T_k</code> denotes the k-th triangular number.
 * @author Luc Rousseau
 */
public class A306597 implements Sequence {

  private class Interval implements Comparable<Interval> {
    private final int mMin;
    private final int mMax;

    private Interval(final int min, final int max) {
      mMin = min;
      mMax = max;
    }

    private  Interval shift(final int d) {
      return new Interval(mMin + d, mMax + d);
    }

    @Override
    public int compareTo(final Interval that) {
      final int dMin = Integer.compare(mMin, that.mMin);
      return dMin != 0 ? dMin : Integer.compare(mMax, that.mMax);
    }

    @Override
    public boolean equals(final Object obj) {
      return obj instanceof Interval && ((Interval) obj).mMax == mMax && ((Interval) obj).mMin == mMin;
    }

    @Override
    public int hashCode() {
      return mMax * 65537 + mMin;
    }
  }

  private int mN = 0;

  private static int t(final int n) {
    return n * (n + 1) / 2;
  }

  private int a(final int n) {
    final int tn = t(n);
    SortedMap<Integer, SortedSet<Interval>> m = init();
    for (int k = n; k >= 1; --k) {
      m = merge(evolve(tn, k, m));
    }
    return size(m.get(tn));
  }

  private SortedMap<Integer, SortedSet<Interval>> init() {
    final SortedMap<Integer, SortedSet<Interval>> m = new TreeMap<>();
    final SortedSet<Interval> set0 = new TreeSet<>();
    set0.add(new Interval(0, 0));
    m.put(0, set0);
    return m;
  }

  private SortedMap<Integer, SortedSet<Interval>> evolve(final int tn, final int k, final SortedMap<Integer, SortedSet<Interval>> m) {
    final int tk = t(k);
    final SortedMap<Integer, SortedSet<Interval>> mm = new TreeMap<>();
    for (final Map.Entry<Integer, SortedSet<Interval>> entry : m.entrySet()) {
      final int s = entry.getKey();
      final Set<Interval> setF = entry.getValue();
      final int r = tn - s;
      final int xmin = (k > 1) ? 0 : r;
      final int xmax = r / tk;
      for (int x = xmin; x <= xmax; x++) {
        final SortedSet<Interval> setFF = mm.computeIfAbsent(s + x * tk, k1 -> new TreeSet<>());
        for (final Interval f : setF) {
          setFF.add(f.shift(x * k));
        }
      }
    }
    return mm;
  }

  private SortedMap<Integer, SortedSet<Interval>> merge(final SortedMap<Integer, SortedSet<Interval>> m) {
    final SortedMap<Integer, SortedSet<Interval>> mm = new TreeMap<>();
    for (final Map.Entry<Integer, SortedSet<Interval>> e : m.entrySet()) {
      mm.put(e.getKey(), merge(e.getValue()));
    }
    return mm;
  }

  private SortedSet<Interval> merge(final SortedSet<Interval> s) {
    int min = -1;
    int max = -1;
    final SortedSet<Interval> ss = new TreeSet<>();
    for (final Interval i : s) {
      if (min == -1) {
        min = i.mMin;
        max = i.mMax;
      } else if (i.mMin > max + 1) {
        ss.add(new Interval(min, max));
        min = i.mMin;
        max = i.mMax;
      } else if (min <= i.mMin && i.mMin <= max) {
        max = Math.max(max, i.mMax);
      } else if (i.mMin == max + 1) {
        max = i.mMax;
      } else {
        throw new IllegalStateException();
      }
    }
    ss.add(new Interval(min, max));
    return ss;
  }

  private int size(final SortedSet<Interval> s) {
    int t = 0;
    for (final Interval i : s) {
      t += i.mMax - i.mMin + 1;
    }
    return t;
  }

  @Override
  public Z next() {
    return Z.valueOf(a(++mN));
  }
}
