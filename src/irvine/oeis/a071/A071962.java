package irvine.oeis.a071;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A071962 Number of double points of the map that, for each term t of a sequence, counts the preceding terms that are greater than or equal to t.
 * @author Sean A. Irvine
 */
public class A071962 extends Sequence0 {

  private Set<List<Integer>> mA = new HashSet<>();

  private List<Integer> geq(final List<Integer> t) {
    final ArrayList<Integer> res = new ArrayList<>(t.size());
    for (int k = 0; k < t.size(); ++k) {
      final int tk = t.get(k);
      int cnt = 0;
      for (int j = 0; j < k; ++j) {
        if (t.get(j) >= tk) {
          ++cnt;
        }
      }
      res.add(cnt);
    }
    return res;
  }

  @Override
  public Z next() {
    if (mA.isEmpty()) {
      mA.add(Collections.singletonList(0));
    } else {
      final Set<List<Integer>> doublePoints = new HashSet<>();
      for (final List<Integer> prev : mA) {
        for (int k = 0; k <= prev.size(); ++k) {
          final List<Integer> t = new ArrayList<>(prev);
          t.add(k); // new coordinate
          if (!doublePoints.contains(t)) {
            final List<Integer> geq = geq(t);
            if (geq(geq).equals(t)) {
              doublePoints.add(t);
              doublePoints.add(geq);
            }
          }
        }
      }
      mA = doublePoints;
    }
    return Z.valueOf(mA.size());
  }
}
