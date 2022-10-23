package irvine.oeis.a052;

import irvine.math.LongUtils;
import irvine.math.z.Z;
import irvine.math.z.ZUtils;
import irvine.oeis.Sequence1;

/**
 * A052423 Highest common factor of nonzero digits of n.
 * @author Sean A. Irvine
 */
public class A052423 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    final int[] cnts = ZUtils.digitCounts(++mN);
    long g = 0;
    for (int k = 1; k < cnts.length; ++k) {
      if (cnts[k] > 0) {
        g = g == 0 ? k : LongUtils.gcd(g, k);
      }
    }
    return Z.valueOf(g);
  }
}
