package irvine.oeis.a064;

import irvine.math.z.Z;
import irvine.math.z.ZUtils;
import irvine.oeis.Sequence1;

/**
 * A064150 Numbers divisible by the sum of their ternary digits.
 * @author Sean A. Irvine
 */
public class A064150 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    while (true) {
      if (++mN % ZUtils.digitSum(mN, 3) == 0) {
        return Z.valueOf(mN);
      }
    }
  }
}
