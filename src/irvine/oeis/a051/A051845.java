package irvine.oeis.a051;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;
import irvine.util.Permutation;

/**
 * A051845 Table in which n-th row gives all permutations of digits 1..n interpreted in base n+1.
 * @author Sean A. Irvine
 */
public class A051845 extends Sequence1 {

  private int mN = 1;
  private Permutation mPerm = new Permutation(1);

  @Override
  public Z next() {
    int[] p = mPerm.next();
    if (p == null) {
      mPerm = new Permutation(++mN);
      p = mPerm.next();
    }
    Z res = Z.ZERO;
    for (final int v : p) {
      res = res.multiply(mN + 1).add(v + 1);
    }
    return res;
  }
}

