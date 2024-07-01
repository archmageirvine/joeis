package irvine.oeis.a071;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A060316.
 * @author Sean A. Irvine
 */
public class A071115 extends Sequence1 {

  // After Michael S. Branicky

  private final List<Z> mA = new ArrayList<>();
  private int mN = 0;

  private Z a(final int n, final List<Z> v) {
    final List<Map<Set<Z>, Set<Z>>> r = new ArrayList<>();
    for (int k = 0; k < n; ++k) {
      r.add(new HashMap<>());
    }
    for (final Z t : v) {
      final HashSet<Z> s = new HashSet<>();
      s.add(t);
      r.get(0).put(s, new HashSet<>(s));
    }
    final HashSet<Z> reach = new HashSet<>(v);
    for (int j = 1; j < n; ++j) {
      for (int i = 0; i < (j + 1) / 2; ++i) {
        for (final Set<Z> s1 : r.get(i).keySet()) {
          for (final Set<Z> s2 : r.get(j - 1 - i).keySet()) {
            if (Collections.disjoint(s1, s2)) {
              final TreeSet<Z> s12 = new TreeSet<>(s1);
              s12.addAll(s2);
              final Set<Z> allowed = r.get(s12.size() - 1).computeIfAbsent(s12, s -> new HashSet<>());
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
    if (mA.isEmpty()) {
      mA.add(Z.ONE);
      return Z.ONE;
    }
    final Z res = a(++mN, mA);
    mA.add(res);
    return res;
  }

}
