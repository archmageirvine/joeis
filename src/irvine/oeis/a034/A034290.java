package irvine.oeis.a034;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.TreeSet;

import irvine.math.z.Z;
import irvine.math.z.ZUtils;
import irvine.oeis.Sequence;

/**
 * A034290 Cubes that have some nontrivial permutation of digits that is also a cube.
 * @author Sean A. Irvine
 */
public class A034290 implements Sequence {

  private final TreeSet<Z> mA = new TreeSet<>();
  private Z mLim = Z.valueOf(100);
  private long mN = 4;

  @Override
  public Z next() {
    while (mA.isEmpty()) {
      mLim = mLim.multiply(10);
      final HashMap<Z, List<Z>> map = new HashMap<>();
      Z s;
      while ((s = Z.valueOf(mN).pow(3)).compareTo(mLim) < 0) {
        final Z sort = ZUtils.sortDigitsAscending(s);
        final List<Z> v = map.get(sort);
        if (v == null) {
          final ArrayList<Z> t = new ArrayList<>();
          t.add(s);
          map.put(sort, t);
        } else {
          v.add(s);
        }
        ++mN;
      }
      for (final List<Z> lst : map.values()) {
        if (lst.size() > 1) {
          mA.addAll(lst);
        }
      }
    }
    return mA.pollFirst();
  }
}

