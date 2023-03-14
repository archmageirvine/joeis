package irvine.oeis.a061;

import irvine.math.IntegerUtils;
import irvine.math.z.Z;
import irvine.oeis.Sequence2;
import irvine.util.Permutation;

/**
 * A061845 Numbers that have one of every digit in some base.
 * @author Sean A. Irvine
 */
public class A061845 extends Sequence2 {

  private Permutation mPerm = new Permutation(new int[] {1, 0}, false);
  private int mN = 2;

  @Override
  public Z next() {
    int[] p = mPerm.next();
    if (p == null) {
      final int[] t = IntegerUtils.identity(new int[++mN]);
      t[0] = 1;
      t[1] = 0;
      mPerm = new Permutation(t, false);
      p = mPerm.next();
    }
    Z res = Z.ZERO;
    for (final int v : p) {
      res = res.multiply(mN).add(v);
    }
    return res;
  }
}

