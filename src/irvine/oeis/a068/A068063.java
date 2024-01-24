package irvine.oeis.a068;

import java.util.TreeSet;

import irvine.math.z.Z;
import irvine.oeis.a051.A051014;
import irvine.util.Pair;

/**
 * A068063 Maximum cardinality of a nondividing subset of {1, 2, ..., n}.
 * @author Sean A. Irvine
 */
public class A068063 extends A051014 {

  @Override
  protected long b(final int i, final TreeSet<Integer> s) {
    if (i < 2) {
      return s.size();
    }
    final Pair<Integer, TreeSet<Integer>> key = new Pair<>(i, s);
    final Long v = mBCache.get(key);
    if (v != null) {
      return v;
    }
    final TreeSet<Integer> si = new TreeSet<>(s);
    si.add(i);
    boolean ok = true;
    outer:
    for (final int j : mS.getValue(si)) {
      for (final int t : si) {
        if (j != t && j % t == 0) {
          ok = false;
          break outer;
        }
      }
    }
    long res = b(i - 1, s);
    if (ok) {
      res = Long.max(res, b(i - 1, si));
    }
    mBCache.put(key, res);
    return res;
  }

  private int mN = -1;

  @Override
  public Z next() {
    return ++mN <= 1 ? Z.valueOf(mN) : Z.valueOf(b(mN, new TreeSet<>()));
  }
}
