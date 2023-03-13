package irvine.oeis.a061;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

import irvine.math.z.Z;
import irvine.math.z.ZUtils;
import irvine.oeis.Sequence1;

/**
 * A061863 Numbers that are the product of the squares of some subset of their digits.
 * @author Sean A. Irvine
 */
public class A061863 extends Sequence1 {

  private final TreeMap<Z, Set<List<Integer>>> mA = new TreeMap<>();

  private boolean lt(final List<Integer> a, final int[] b) {
    for (int k = 2; k < a.size(); ++k) {
      if (a.get(k) > b[k]) {
        return false;
      }
    }
    return true;
  }

  @Override
  public Z next() {
    if (mA.isEmpty()) {
      mA.put(Z.ONE, Collections.singleton(Arrays.asList(0, 0, 0, 0, 0, 0, 0, 0, 0, 0)));
      return Z.ZERO;
    }
    while (true) {
      final Map.Entry<Z, Set<List<Integer>>> e = mA.pollFirstEntry();
      final Z v = e.getKey();
      for (final List<Integer> cnts : e.getValue()) {
        for (int d = 2; d < 10; ++d) {
          final List<Integer> cd = new ArrayList<>(cnts);
          cd.set(d, cd.get(d) + 1);
          final Z vd2 = v.multiply(d * d);
          final Set<List<Integer>> lst = mA.get(vd2);
          if (lst == null) {
            final HashSet<List<Integer>> newList = new HashSet<>();
            newList.add(cd);
            mA.put(vd2, newList);
          } else {
            lst.add(cd);
          }
        }
      }
      for (final List<Integer> cnts : e.getValue()) {
        if (lt(cnts, ZUtils.digitCounts(v))) {
          return v;
        }
      }
    }
  }
}
