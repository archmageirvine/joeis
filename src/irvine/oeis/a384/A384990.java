package irvine.oeis.a384;

import irvine.math.IntegerUtils;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;
import irvine.util.Permutation;

/**
 * A384990 Order of the permutation of [n] formed by a Josephus elimination variation: take k, skip 1, with k starting at 1 and increasing by 1 after each skip.
 * @author Sean A. Irvine
 */
public class A384990 extends Sequence1 {

  private int mN = 0;

  @Override
  public Z next() {
    final int[] p = IntegerUtils.identity(new int[++mN]);
    for (int k = 1, j = 0; k < p.length; k += ++j) {
      final int v = p[k];
      System.arraycopy(p, k + 1, p, k, p.length - k - 1);
      p[p.length - 1] = v;
    }
    return Permutation.order(p);
  }
}
