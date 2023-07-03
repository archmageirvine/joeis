package irvine.oeis.a051;

import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

import irvine.factor.factor.Jaguar;
import irvine.oeis.memory.MemoryFunction2Sequence;
import irvine.math.z.Z;
import irvine.util.Point;

/**
 * A051707 Number of factorizations of (n,n) into pairs (j,k).
 * @author Sean A. Irvine
 */
public class A051707 extends MemoryFunction2Sequence<Integer, Set<Map<Point, Integer>>> {

  private static final Set<Map<Point, Integer>> ONE_ONE = Collections.singleton(Collections.singletonMap(new Point(1, 1), 1));
  private int mN = 0;

  @Override
  protected Set<Map<Point, Integer>> compute(final Integer n, final Integer m) {
    if (n == 1) {
      return m == 1 ? ONE_ONE : Collections.emptySet();
    }
    final HashSet<Map<Point, Integer>> factorizations = new HashSet<>();
    factorizations.add(Collections.singletonMap(new Point(n, m), 1));
    for (final Z dd : Jaguar.factor(n).divisors()) {
      final int d = dd.intValue();
      if (d > 1 && d < n) {
        for (final Z ee : Jaguar.factor(m).divisors()) {
          final int e = ee.intValue();
          for (final Map<Point, Integer> t : get(n / d, m / e)) {
            final Map<Point, Integer> f = new HashMap<>();
            f.put(new Point(d, e), 1);
            for (Map.Entry<Point, Integer> entry : t.entrySet()) {
              final Point pt = entry.getKey();
              final int multiplicity = entry.getValue();
              f.merge(pt, multiplicity, Integer::sum);
            }
            factorizations.add(f);
          }
        }
      }
    }
    return factorizations;
  }

  @Override
  public Z next() {
    return Z.valueOf(get(++mN, mN).size());
  }
}
