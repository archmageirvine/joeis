package irvine.oeis.a002;

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.util.Pair;

import java.util.List;
import java.util.ArrayList;
import java.util.HashMap;

/**
 * A002849 Maximal number of disjoint subsets <code>{X,Y,Z}</code> of <code>{1, 2</code>, ..., <code>n}</code>, each satisfying X <code>+ Y =</code> Z.
 * @author Sean A. Irvine
 */
public class A002849 implements Sequence {

  // After Franklin T. Adams-Watters

  private int mN = 0;

  private HashMap<Pair<List<Long>, Integer>, Z> mCache = new HashMap<>();

  private Z nxyz(final List<Long> v, final int t) {
    if (t == 0) {
      return Z.ONE;
    }
    final Pair<List<Long>, Integer> key = new Pair<>(v, t);
    final Z res = mCache.get(key);
    if (res != null) {
      return res;
    }
    Z r = Z.ZERO;
    for (int i3 = 3 * t; i3 < v.size(); ++i3) {
      final long n = v.get(i3);
      for (int i1 = 1; i1 <= i3 - 2; ++i1) {
        final long x2 = n - v.get(i1);
        if (x2 <= v.get(i1)) {
          break;
        }
        for (int i2 = i1 + 1; i2 < i3; ++i2) {
          if (v.get(i2) >= x2) {
            if (v.get(i2) == x2) {
              final ArrayList<Long> newV = new ArrayList<>();
              for (int k = 0; k <= i3 - 3; ++k) {
                newV.add(v.get(k < i1 ? k : (k < i2 - 1 ? k + 1 : k + 2)));
              }
              r = r.add(nxyz(newV, t - 1));
            }
            break;
          }
        }
      }
    }
    mCache.put(key, r);
    return r;
  }

  @Override
  public Z next() {
    ++mN;
    final int r = mN % 12;
    final int t = mN / 3 - (r == 6 || r == 9 ? 1 : 0);
    final ArrayList<Long> v = new ArrayList<>();
    for (long k = 0; k <= mN; ++k) {
      v.add(k);
    }
    return nxyz(v, t);
  }
}
