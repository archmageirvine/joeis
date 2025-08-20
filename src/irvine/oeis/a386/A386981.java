package irvine.oeis.a386;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;
import irvine.util.Pair;

/**
 * A386981 allocated for Frank M Jackson.
 * @author Sean A. Irvine
 */
public class A386981 extends Sequence1 {

  private long mN = 0;

  private Collection<Pair<Long, Long>> getFactorPairs(final long r) {
    final Collection<Pair<Long, Long>> pairs = new HashSet<>();
    for (long d = 1; d * d <= r; ++d) {
      if (r % d == 0) {
        final long q = r / d;
        final long a = Math.min(d, q);
        final long b = Math.max(d, q);
        pairs.add(new Pair<>(a, b));
      }
    }
    return pairs;
  }

  private Map<Long, Collection<Pair<Long, Long>>> getAsc(final long ro) {
    final Map<Long, Collection<Pair<Long, Long>>> asc = new HashMap<>();
    final long ro2 = ro * ro;
    final long maxU = Functions.SQRT.l(3 * ro2);
    for (long u = 1; u <= maxU; ++u) {
      asc.put(u, getFactorPairs(ro2 * (ro2 + u * u)));
    }
    return asc;
  }

  private List<long[]> obtuseHeronianTriangles(final long rho) {
    final Map<Long, Collection<Pair<Long, Long>>> asc = getAsc(rho);
    final List<long[]> lst1 = new ArrayList<>();
    final long rho2 = rho * rho;
    for (final long n : asc.keySet()) {
      for (final Pair<Long, Long> pair : asc.get(n)) {
        final long a = pair.left();
        final long b = pair.right();
        final long x = a + rho2;
        final long y = b + rho2;
        if (x % n == 0 && y % n == 0) {
          final long v1 = x / n;
          final long v2 = y / n;
          if (rho > n && n <= v1) {
            lst1.add(new long[]{n, v1, v2});
          }
        }
      }
    }
    return lst1;
  }

  @Override
  public Z next() {
    return Z.valueOf(obtuseHeronianTriangles(++mN).size());
  }
}
