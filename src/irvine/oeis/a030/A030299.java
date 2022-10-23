package irvine.oeis.a030;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;
import irvine.util.Permutation;

/**
 * A030299 Decimal representation of permutations of lengths 1, 2, 3, ... arranged lexicographically.
 * @author Sean A. Irvine
 */
public class A030299 extends Sequence1 {

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

