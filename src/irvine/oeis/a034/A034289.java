package irvine.oeis.a034;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.TreeSet;

import irvine.math.z.Z;
import irvine.math.z.ZUtils;
import irvine.oeis.Sequence;

/**
 * A034289 Squares which can be rearranged into squares with the same number of digits.
 * @author Sean A. Irvine
 */
public class A034289 implements Sequence {

  private final TreeSet<Z> mA = new TreeSet<>();
  private Z mLim = Z.valueOf(100);
  private long mN = 12;

  @Override
  public Z next() {
    while (mA.isEmpty()) {
      mLim = mLim.multiply(10);
      final HashMap<Z, List<Z>> map = new HashMap<>();
      Z s;
      while ((s = Z.valueOf(mN).square()).compareTo(mLim) < 0) {
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

