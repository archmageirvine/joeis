package irvine.oeis.a067;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;
import irvine.util.Permutation;

/**
 * A067001.
 * @author Sean A. Irvine
 */
public class A067012 extends Sequence1 {

  private Z mN = Z.THREE;

  private boolean is(final Z n) {
    if (n.isProbablePrime()) {
      return false;
    }
    final Permutation perm = Permutation.permuter(n);
    int[] p;
    while ((p = perm.next()) != null) {
      final Z z = Permutation.permToZ(p);
      if (Z.ONE.equals(z) || z.isProbablePrime()) {
        return false;
      }
    }
    return true;
  }

  @Override
  public Z next() {
    while (true) {
      mN = mN.add(1);
      if (is(mN)) {
        return mN;
      }
    }
  }
}
