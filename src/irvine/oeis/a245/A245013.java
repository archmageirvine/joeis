package irvine.oeis.a245;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import irvine.math.z.Z;
import irvine.oeis.Sequence0;
import irvine.util.Pair;

/**
 * A245013 Number A(n,k) of tilings of a k X n rectangle using 1 X 1 squares and 2 X 2 squares; square array A(n,k), n&gt;=0, k&gt;=0, read by antidiagonals.
 * @author Sean A. Irvine
 */
public class A245013 extends Sequence0 {

  // After Alois P. Heinz

  private int mN = -1;
  private int mM = 0;
  private final Map<Pair<Integer, List<Integer>>, Z> mCache = new HashMap<>();
  
  private int min(final List<Integer> lst) {
    int min = Integer.MAX_VALUE;
    for (final int v : lst) {
      if (v < min) {
        min = v;
      }
    }
    return min;
  }

  private Z computeB(final Pair<Integer, List<Integer>> key) {
    final int n = key.left();
    final List<Integer> l = key.right();
    final int m = min(l);
    if (m > 0) {
      final List<Integer> nl = new ArrayList<>(l.size());
      for (final int v : l) {
        nl.add(v - m);
      }
      return b(n - m, nl);
    } else if (n == 0) {
      return Z.ONE;
    } else {
      int k = -1;
      while (l.get(++k) > 0) {
        // do nothing
      }
      final int v = l.set(k, 1);
      final Z u = b(n, l);
      l.set(k, v);
      if (n > 1 && k + 1 < l.size() && l.get(k + 1) == 0) {
        final int i = l.set(k, 2);
        final int j = l.set(k + 1, 2);
        final Z w = b(n, l);
        l.set(k + 1, j);
        l.set(k, i);
        return u.add(w);
      }
      return u;
    }
  }

  private Z b(final int n, final List<Integer> l) {
    final Pair<Integer, List<Integer>> key = new Pair<>(n, l); 
    final Z res = mCache.get(key);
    if (res != null) {
      return res;
    }
    final Z r = computeB(key);
    mCache.put(key, r);
    return r;
  }

  protected Z t(final int n, final int k) {
    if (n < 2 || k < 2) {
      return Z.ONE;
    }
    final List<Integer> lst = new ArrayList<>();
    for (int j = 0; j < Math.min(n, k); ++j) {
      lst.add(0);
    }
    return b(Math.max(n, k), lst);
  }

  @Override
  public Z next() {
    if (++mM > mN) {
      ++mN;
      mM = 0;
    }
    return t(mM, mN - mM);
  }
}
