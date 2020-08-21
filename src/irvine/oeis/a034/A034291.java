package irvine.oeis.a034;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.TreeSet;

import irvine.math.z.Z;
import irvine.math.z.ZUtils;
import irvine.oeis.a000.A000217;

/**
 * A034291.
 * @author Sean A. Irvine
 */
public class A034291 extends A000217 {

  private final TreeSet<Z> mA = new TreeSet<>();
  private Z mLim = Z.ONE;
  private Z mT = super.next();

  @Override
  public Z next() {
    while (mA.isEmpty()) {
      mLim = mLim.multiply(10);
      final HashMap<Z, List<Z>> map = new HashMap<>();
      while (mT.compareTo(mLim) < 0) {
        final Z sort = ZUtils.sortDigitsAscending(mT);
        final List<Z> v = map.get(sort);
        if (v == null) {
          final ArrayList<Z> t = new ArrayList<>();
          t.add(mT);
          map.put(sort, t);
        } else {
          v.add(mT);
        }
        mT = super.next();
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

