package irvine.oeis.a039;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

import irvine.math.group.SymmetricGroup;
import irvine.math.set.Permutation;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A039745 Diameter of symmetric group S_n when generated by (1,2) and (1,2,3,...,n).
 * @author Sean A. Irvine
 */
public class A039745 extends Sequence1 {

  private int mN = 0;

  @Override
  public Z next() {
    if (++mN == 1) {
      return Z.ZERO;
    }
    final SymmetricGroup<Integer> s = SymmetricGroup.create(mN);
    final int[] x12 = new int[mN];
    x12[0] = 2;
    x12[1] = 1;
    for (int k = 2; k < mN; ++k) {
      x12[k] = k + 1;
    }
    final Permutation<Integer> e12 = Permutation.create(x12);
    final int[] x1n = new int[mN];
    for (int k = 0; k < mN; ++k) {
      x1n[k] = 1 + (k + 1) % mN;
    }
    final Permutation<Integer> e1n = Permutation.create(x1n);
    final Set<Permutation<Integer>> seen = new HashSet<>();
    seen.add(s.zero());
    Set<Permutation<Integer>> todo = Collections.singleton(s.zero());
    int diameter = -1;
    while (!todo.isEmpty()) {
      ++diameter;
      final Set<Permutation<Integer>> next = new HashSet<>();
      for (final Permutation<Integer> p : todo) {
        final Permutation<Integer> p1 = s.add(p, e12);
        if (seen.add(p1)) {
          next.add(p1);
        }
        final Permutation<Integer> p2 = s.add(p, e1n);
        if (seen.add(p2)) {
          next.add(p2);
        }
      }
      todo = next;
    }
    return Z.valueOf(diameter);
  }
}
