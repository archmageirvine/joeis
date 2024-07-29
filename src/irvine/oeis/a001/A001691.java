package irvine.oeis.a001;

import irvine.math.group.SymmetricGroup;
import irvine.math.set.FiniteSet;
import irvine.math.set.Permutation;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A040173.
 * @author Sean A. Irvine
 */
public class A001691 extends Sequence1 {

  // Only good through to about a(5)

  private int mN = 0;

  @Override
  @SuppressWarnings("unchecked")
  public Z next() {
    final SymmetricGroup<Integer> g = SymmetricGroup.create(++mN);
    final Z size = g.size();
    long cnt = 0;
    for (final Permutation<Integer> a : g) {
      for (final Permutation<Integer> b : g) {
        if (a.equals(b)) {
          break;
        }
        if (g.generateSubgroup(new FiniteSet<>(a, b)).size().equals(size)) {
          ++cnt;
        }
      }
    }
    return Z.valueOf(cnt);
  }
}
