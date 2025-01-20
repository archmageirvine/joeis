package irvine.oeis.a074;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.math.z.ZUtils;
import irvine.oeis.Sequence1;

/**
 * A074257 Sum of factorials of digits of n equals the largest prime factor of n.
 * @author Sean A. Irvine
 */
public class A074257 extends Sequence1 {

  private long mN = 1;

  @Override
  public Z next() {
    while (true) {
      Z sum = Functions.GPF.z(++mN);
      final int[] cnts = ZUtils.digitCounts(mN);
      for (int k = 0; k < cnts.length; ++k) {
        sum = sum.subtract(Functions.FACTORIAL.z(k).multiply(cnts[k]));
      }
      if (sum.isZero()) {
        return Z.valueOf(mN);
      }
    }
  }
}
