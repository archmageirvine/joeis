package irvine.oeis.a071;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A071115.
 * @author Sean A. Irvine
 */
public class A071985 extends Sequence1 {

  private int mN = 0;

  private Z a(final int n, final List<Z> v) {
    final List<Map<Long, Set<Z>>> r = new ArrayList<>();
    for (int k = 0; k < n; ++k) {
      r.add(new HashMap<>());
    }
    for (int k = 1; k <= mN; ++k) {
      final HashSet<Z> s = new HashSet<>();
      s.add(Z.valueOf(k));
      r.get(0).put(1L << (k - 1), new HashSet<>(s));
    }
    final HashSet<Z> reach = new HashSet<>(v);
    for (int j = 1; j < n; ++j) {
      for (int i = 0; i < (j + 1) / 2; ++i) {
        for (final long s1 : r.get(i).keySet()) {
          for (final long s2 : r.get(j - 1 - i).keySet()) {
            if ((s1 & s2) == 0) { // Disjoint sets
              final long s12 = s1 | s2;
              final Set<Z> allowed = r.get(Long.bitCount(s12) - 1).computeIfAbsent(s12, s -> new HashSet<>());
              for (final Z a : r.get(i).get(s1)) {
                for (final Z b : r.get(j - 1 - i).get(s2)) {
                  final Z t1 = a.add(b);
                  allowed.add(t1);
                  reach.add(t1);
                  final Z t2 = a.multiply(b);
                  allowed.add(t2);
                  reach.add(t2);
                  final Z t3 = a.subtract(b);
                  allowed.add(t3);
                  reach.add(t3);
                  final Z t4 = b.subtract(a);
                  allowed.add(t4);
                  reach.add(t4);
                  if (!a.isZero() && b.mod(a).isZero()) {
                    final Z t5 = b.divide(a);
                    allowed.add(t5);
                    reach.add(t5);
                  }
                  if (!b.isZero() && a.mod(b).isZero()) {
                    final Z t6 = a.divide(b);
                    allowed.add(t6);
                    reach.add(t6);
                  }
                }
              }
            }
          }
        }
      }
    }
    Z k = Z.ONE;
    while (reach.contains(k)) {
      k = k.add(1);
    }
    return k;
  }

  @Override
  public Z next() {
    if (++mN == 1) {
      return Z.ONE;
    }
    final List<Z> start = new ArrayList<>();
    for (int k = 1; k <= mN; ++k) {
      start.add(Z.valueOf(k));
    }
    return a(mN - 1, start);
  }
}
