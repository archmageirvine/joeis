package irvine.oeis.a061;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;
import irvine.util.Permutation;

/**
 * A061147 Product of all distinct numbers formed by permuting digits of n.
 * @author Sean A. Irvine
 */
public class A061147 extends Sequence1 {

  private Z mN = Z.ZERO;

  @Override
  public Z next() {
    mN = mN.add(1);
    final Permutation perm = Permutation.permuter(mN);
    int[] p;
    Z prod = Z.ONE;
    while ((p = perm.next()) != null) {
      prod = prod.multiply(Permutation.permToZ(p));
    }
    return prod;
  }
}
