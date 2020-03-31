package irvine.oeis.a030;

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.util.Permutation;

/**
 * A030298.
 * @author Sean A. Irvine
 */
public class A030299 implements Sequence {

  private Permutation mPerm = new Permutation(1);
  private int mN = 1;

  private Z flatten(final int[] p) {
    Z res = Z.ZERO;
    for (final int v : p) {
      res = res.multiply(10).add(v + 1);
    }
    return res;
  }

  @Override
  public Z next() {
    int[] p = mPerm.next();
    if (p == null) {
      mPerm = new Permutation(++mN);
      p = mPerm.next();
    }
    return flatten(p);
  }
}

