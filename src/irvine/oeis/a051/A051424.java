package irvine.oeis.a051;

import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;
import java.util.stream.Collectors;

import irvine.factor.factor.Cheetah;
import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.util.Pair;

/**
 * A051424 Number of partitions of n into pairwise relatively prime parts.
 * @author Sean A. Irvine
 */
public class A051424 implements Sequence {

  private long mN = -1;
  private final HashMap<Pair<Pair<Long, Long>, Set<Long>>, Z> mCache = new HashMap<>();

  private Set<Long> select(final Set<Long> s, final long i) {
    return s.stream().filter(x -> x < i).collect(Collectors.toSet());
  }

  private boolean isEmptyIntersection(final Set<Long> s, final Z[] f) {
    for (final Z p : f) {
      if (s.contains(p.longValue())) {
        return false;
      }
    }
    return true;
  }

  private Set<Long> union(final Set<Long> s, final Z[] f) {
    final Set<Long> res = new HashSet<>(s);
    for (final Z p : f) {
      res.add(p.longValue());
    }
    return res;
  }

  private Z computeB(final long n, final long i, final Set<Long> s) {
    if (n == 0 || i == 1) {
      return Z.ONE;
    }
    if (i < 2) {
      return Z.ZERO;
    }
    final Z res = b(n, i - 1, select(s, i));
    final Z[] f = Cheetah.factor(i).toZArray();
    if (i <= n && isEmptyIntersection(s, f)) {
      return res.add(b(n - i, i - 1, select(union(s, f), i)));
    } else {
      return res;
    }
  }

  protected Z b(final long n, final long i, final Set<Long> s) {
    final Pair<Pair<Long, Long>, Set<Long>> key = new Pair<>(new Pair<>(n, i), s);
    final Z res = mCache.get(key);
    if (res != null) {
      return res;
    }
    final Z b = computeB(n, i, s);
    mCache.put(key, b);
    return b;
  }

  @Override
  public Z next() {
    return b(++mN, mN, Collections.emptySet());
  }
}
