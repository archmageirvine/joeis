package irvine.oeis.a384;

import irvine.math.IntegerUtils;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;
import irvine.util.Permutation;

/**
 * A384989 Order of the permutation of [n] formed by a Josephus elimination variation: take 3, skip 1.
 * @author Sean A. Irvine
 */
public class A384989 extends Sequence1 {

  private int mN = -1;

  @Override
  public Z next() {
    final int[] p = IntegerUtils.identity(new int[++mN]);
    for (int k = 2; k < p.length; k += 3) {
      final int v = p[k];
      System.arraycopy(p, k + 1, p, k, p.length - k - 1);
      p[p.length - 1] = v;
    }
    return Permutation.order(p);
  }
}
