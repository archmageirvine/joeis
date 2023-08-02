package irvine.oeis.a055;

import irvine.math.z.Z;
import irvine.math.z.ZUtils;
import irvine.oeis.Sequence0;

/**
 * A055013 Sum of 4th powers of digits of n.
 * @author Sean A. Irvine
 */
public class A055013 extends Sequence0 {

  private long mN = -1;

  @Override
  public Z next() {
    long sum = 0;
    final int[] cnts = ZUtils.digitCounts(++mN);
    for (int k = 1; k < cnts.length; ++k) {
      final long k2 = (long) k * k;
      sum += k2 * k2 * cnts[k];
    }
    return Z.valueOf(sum);
  }
}
