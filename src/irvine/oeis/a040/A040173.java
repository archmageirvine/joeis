package irvine.oeis.a040;

import irvine.math.group.SymmetricGroup;
import irvine.math.q.Q;
import irvine.math.set.FiniteSet;
import irvine.math.set.Permutation;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A040173 Numerator of probability that 2 elements of S_n chosen at random (with replacement) generate S_n.
 * @author Sean A. Irvine
 */
public class A040173 extends Sequence1 {

  protected int mN = 0;

  protected Z select(final Q n) {
    return n.num();
  }

  @Override
  public Z next() {
    final SymmetricGroup<Integer> g = SymmetricGroup.create(++mN);
    final Z size = g.size();
    long cnt = 0;
    long total = 0;
    for (final Permutation<Integer> a : g) {
      for (final Permutation<Integer> b : g) {
        final int inc = a.equals(b) ? 1 : 2;
        total += inc;
        if (g.generateSubgroup(new FiniteSet<>(a, b)).size().equals(size)) {
          cnt += inc;
        }
        if (inc == 1) {
          break;
        }
      }
    }
    return select(new Q(cnt, total));
  }
}
