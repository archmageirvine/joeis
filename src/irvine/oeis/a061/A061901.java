package irvine.oeis.a061;

import java.util.HashSet;

import irvine.math.z.Z;
import irvine.oeis.Sequence0;
import irvine.util.Permutation;

/**
 * A061859.
 * @author Sean A. Irvine
 */
public class A061901 extends Sequence0 {

  private Z mN = Z.NEG_ONE;

  @Override
  public Z next() {
    mN = mN.add(1);
    final HashSet<Z> res = new HashSet<>();
    final Permutation perm = Permutation.permuter(mN);
    int[] p;
    while ((p = perm.next()) != null) {
      Z q = Z.ZERO;
      for (final int v : p) {
        q = q.multiply(10).add(v);
        res.add(q);
      }
    }
    return Z.valueOf(res.size());
  }
}
