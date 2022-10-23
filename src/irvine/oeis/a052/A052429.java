package irvine.oeis.a052;

import irvine.math.LongUtils;
import irvine.math.z.Z;
import irvine.math.z.ZUtils;
import irvine.oeis.Sequence1;

/**
 * A052429 Least common multiple of nonzero digits of n.
 * @author Sean A. Irvine
 */
public class A052429 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    final int[] cnts = ZUtils.digitCounts(++mN);
    long lcm = 1;
    for (int k = 1; k < cnts.length; ++k) {
      if (cnts[k] > 0) {
        lcm = LongUtils.lcm(lcm, k);
      }
    }
    return Z.valueOf(lcm);
  }
}
