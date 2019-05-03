package irvine.oeis.a007;

import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.util.Pair;

/**
 * A007846 There are three equivalent descriptions: 1. Number of (horizontally or vertically) connected arrays of <code>1..n</code> on rectangular grid <code>(otherwise zero)</code> with only one local maximum. 2. Number of n-polyominoes labeled <code>1...n</code> such that each successive labeled cell is the neighbor of a previously labeled cell. 3. Number of connected n-step paths on a rectangular lattice, diagonal or repeated steps not allowed.
 * @author Sean A. Irvine
 */
public class A007846 implements Sequence {

  // Too slow to be useful

  private HashSet<Map<Pair<Integer, Integer>, Integer>> mA = null;

  private void insert(final HashSet<Map<Pair<Integer, Integer>, Integer>> next, final Map<Pair<Integer, Integer>, Integer> map, final int x, final int y, final int n) {
    final Pair<Integer, Integer> key = new Pair<>(x, y);
    if (!map.containsKey(key)) {
      final Map<Pair<Integer, Integer>, Integer> newMap = new HashMap<>(map);
      newMap.put(new Pair<>(x, y), n);
      next.add(newMap);
    }
  }

  @Override
  public Z next() {
    if (mA == null) {
      mA = new HashSet<>();
      return Z.ONE;
    }
    if (mA.isEmpty()) {
      mA.add(Collections.singletonMap(new Pair<>(0, 0), 0));
    } else {
      final HashSet<Map<Pair<Integer, Integer>, Integer>> next = new HashSet<>();
      for (final Map<Pair<Integer, Integer>, Integer> map : mA) {
        final int n = map.size();
        for (final Pair<Integer, Integer> coords : map.keySet()) {
          final int x = coords.left();
          final int y = coords.right();
          insert(next, map, x + 1, y, n);
          insert(next, map, x - 1, y, n);
          insert(next, map, x, y + 1, n);
          insert(next, map, x, y - 1, n);
        }
      }
      mA = next;
    }
    return Z.valueOf(mA.size());
  }
}
