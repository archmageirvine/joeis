package irvine.oeis.a393;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A393296
 * @author Sean A. Irvine
 */
public class A393296 extends Sequence0 {

  private Set<Set<List<Integer>>> mL = null;

  private static Set<List<Integer>> up(final List<Integer> p) {
    final Set<List<Integer>> res = new HashSet<>();
    final int n = p.size();
    // increase existing rows
    for (int k = 0; k < n; ++k) {
      if (k == 0 || p.get(k) < p.get(k - 1)) {
        final List<Integer> q = new ArrayList<>(p);
        q.set(k, q.get(k) + 1);
        res.add(q);
      }
    }
    // add new row of size 1 (can reuse existing list)
    final List<Integer> q = new ArrayList<>(p);
    q.add(1);
    res.add(q);
    return res;
  }

  private static boolean containsAllDown(final Set<List<Integer>> set, final List<Integer> p) {
    final int n = p.size();
    for (int i = 0; i < n; ++i) {
      if (i == n - 1 || p.get(i) > p.get(i + 1)) {
        final List<Integer> q = new ArrayList<>(p);
        if (q.get(i) == 1) {
          q.remove(i);
        } else {
          q.set(i, q.get(i) - 1);
        }
        if (!set.contains(q)) {
          return false;
        }
      }
    }
    return true;
  }

  @Override
  public Z next() {
    if (mL == null) {
      mL = Collections.emptySet();
      return Z.ONE;
    }
    if (mL.isEmpty()) {
      final Set<List<Integer>> base = new HashSet<>();
      base.add(Collections.emptyList());
      mL = Collections.singleton(base);
      return Z.ONE;
    }
    final Set<Set<List<Integer>>> next = new HashSet<>();
    for (final Set<List<Integer>> set : mL) {
      for (final List<Integer> x : set) {
        for (final List<Integer> y : up(x)) {
          if (!set.contains(y) && containsAllDown(set, y)) {
            final Set<List<Integer>> s2 = new HashSet<>(set);
            s2.add(y);
            next.add(s2);
          }
        }
      }
    }
    mL = next;
    return Z.valueOf(mL.size());
  }
}
