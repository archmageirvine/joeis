package irvine.oeis.a395;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

import irvine.factor.factor.Jaguar;
import irvine.math.IntegerUtils;
import irvine.math.MemoryFunctionInt2;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A395190 a(n) is the number of partitions of n into distinct parts that contain a subset whose product is n.
 * @author Sean A. Irvine
 */
public class A395190 extends Sequence1 {

  // After Felix Huber

  private int mN = 0;
  private final HashMap<String, Z> mCache = new HashMap<>();

  private final MemoryFunctionInt2<List<List<Integer>>> mF = new MemoryFunctionInt2<>() {
    @Override
    protected List<List<Integer>> compute(final int r, final int l) {
      if (r == 1) {
        return Collections.singletonList(Collections.emptyList());
      }
      final ArrayList<List<Integer>> s = new ArrayList<>();
      for (final Z dd : Jaguar.factor(r).divisorsSorted()) {
        final int d = dd.intValue();
        if (d >= l && d > 1) {
          for (final List<Integer> t : get(r / d, d + 1)) {
            final ArrayList<Integer> g = new ArrayList<>();
            g.add(d);
            g.addAll(t);
            s.add(g);
          }
        }
      }
      return Collections.unmodifiableList(s);
    }
  };

  private List<List<Integer>> p(final int n) {
    return mF.get(n, 2);
  }

  private Z b(final int m, final int i, final List<Integer> l) {
    if (m == 0) {
      return Z.ONE;
    }
    if (i < 0) {
      return Z.ZERO;
    }
    final String key = m + l.toString() + i;
    final Z v = mCache.get(key);
    if (v != null) {
      return v;
    }
    Z t = b(m, i - 1, l);
    if (l.get(i) <= m) {
      t = t.add(b(m - l.get(i), i - 1, l));
    }
    mCache.put(key, t);
    return t;
  }

  @Override
  public Z next() {
    ++mN;
    Z a = Z.ZERO;
    for (final List<Integer> j : p(mN)) {
      final ArrayList<Integer> l = new ArrayList<>();
      for (int k = 1, i = 0; k <= mN; ++k) {
        if (i < j.size() && j.get(i) == k) {
          ++i;
        } else {
          l.add(k);
        }
      }
      a = a.add(b(mN - IntegerUtils.sum(j), l.size() - 1, l));
    }
    return a;
  }
}
