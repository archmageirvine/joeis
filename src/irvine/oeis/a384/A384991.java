package irvine.oeis.a384;

import irvine.math.IntegerUtils;
import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;
import irvine.util.Permutation;

/**
 * A384991 Order of the permutation of [n] formed by a Josephus elimination variation: take p, skip 1, with p starting at 2 and advancing to the next prime after each skip.
 * @author Sean A. Irvine
 */
public class A384991 extends Sequence1 {

  private int mN = 0;

  @Override
  public Z next() {
    final int[] p = IntegerUtils.identity(new int[++mN]);
    for (int k = 1, j = 2; k < p.length; j = Functions.NEXT_PRIME.i(j), k += j - 1) {
      final int v = p[k];
      System.arraycopy(p, k + 1, p, k, p.length - k - 1);
      p[p.length - 1] = v;
    }
    return Permutation.order(p);
  }
}
