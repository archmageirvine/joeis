package irvine.oeis.a061;

import java.util.HashSet;

import irvine.math.z.Z;
import irvine.math.z.ZUtils;
import irvine.oeis.Sequence1;
import irvine.util.Permutation;

/**
 * A061487 a(n) = sum of all the distinct numbers of all sizes formed by the digits of n.
 * @author Sean A. Irvine
 */
public class A061487 extends Sequence1 {

  private long mN = 0;

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
    return ZUtils.sum(set);
  }
}

