package irvine.oeis.a077;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.function.BiFunction;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;
import irvine.util.Pair;

/**
 * A077193.
 * @author Sean A. Irvine
 */
public class A077196 extends Sequence1 {

  // After Jason Yuen

  private int mN = 0;

  protected static <T extends Comparable<T>> Map<Integer, T> dijkstra(final Map<Integer, T> dist, final int start, final T startValue, final BiFunction<Integer, T, List<Pair<T, Integer>>> traverse) {
    dist.put(start, startValue);
    final Queue<Pair<T, Integer>> queue = new LinkedList<>();
    queue.add(new Pair<>(startValue, start));
    while (!queue.isEmpty()) {
      final Pair<T, Integer> p = queue.poll();
      final T value = p.left();
      final int node = p.right();
      if (dist.get(node).equals(value)) {
        for (final Pair<T, Integer> q : traverse.apply(node, value)) {
          final T value2 = q.left();
          final int node2 = q.right();
          if (dist.get(node2).compareTo(value2) > 0) {
            dist.put(node2, value2);
            queue.add(q);
          }
        }
      }
    }
    return dist;
  }


  @Override
  public Z next() {
    ++mN;
    final Map<Integer, Integer> dist = new HashMap<>();
    for (int k = 0; k < mN; ++k) {
      dist.put(k, mN + 1);
    }
    return Z.valueOf(dijkstra(dist, 1 % mN, 1,
      (remainder, add1) -> List.of(new Pair<>(add1, (remainder * 10) % mN), new Pair<>(add1 + 1, (remainder + 1) % mN))).get(0));
  }
}

