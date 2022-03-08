package irvine.oeis.a055;

import irvine.math.z.Z;
import irvine.math.z.ZUtils;
import irvine.oeis.Sequence;

/**
 * A055014 Sum of 5th powers of digits of n.
 * @author Sean A. Irvine
 */
public class A055014 implements Sequence {

  private long mN = -1;

  @Override
  public Z next() {
    long sum = 0;
    final int[] cnts = ZUtils.digitCounts(++mN);
    for (int k = 1; k < cnts.length; ++k) {
      final long k2 = k * k;
      sum += k2 * k2 * k * cnts[k];
    }
    return Z.valueOf(sum);
  }
}
