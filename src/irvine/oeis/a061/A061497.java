package irvine.oeis.a061;

import java.util.HashSet;
import java.util.Set;

import irvine.math.z.Z;
import irvine.math.z.ZUtils;
import irvine.oeis.Sequence1;
import irvine.util.Permutation;

/**
 * A061497 Product of all distinct nonzero numbers that can be formed from the digits of n.
 * @author Sean A. Irvine
 */
public class A061497 extends Sequence1 {

  private long mN = 0;

  protected Z select(final Set<Z> set) {
    return ZUtils.product(set);
  }

  @Override
  public Z next() {
    final Permutation perm = Permutation.permuter(Z.valueOf(++mN));
    final HashSet<Z> set = new HashSet<>();
    int[] p;
    while ((p = perm.next()) != null) {
      Z res = Z.ZERO;
      for (final int d : p) {
        res = res.multiply(10).add(d);
        set.add(res);
      }
    }
    set.remove(Z.ZERO);
    return select(set);
  }
}

