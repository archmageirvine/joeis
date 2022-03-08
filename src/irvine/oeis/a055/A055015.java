package irvine.oeis.a055;

import irvine.math.z.Z;
import irvine.math.z.ZUtils;
import irvine.oeis.Sequence;

/**
 * A055015 Sum of 6th powers of digits of n.
 * @author Sean A. Irvine
 */
public class A055015 implements Sequence {

  private long mN = -1;

  @Override
  public Z next() {
    long sum = 0;
    final int[] cnts = ZUtils.digitCounts(++mN);
    for (int k = 1; k < cnts.length; ++k) {
      final long k3 = k * k * k;
      sum += k3 * k3 * cnts[k];
    }
    return Z.valueOf(sum);
  }
}
