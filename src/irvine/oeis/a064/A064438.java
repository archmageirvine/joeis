package irvine.oeis.a064;

import irvine.math.z.Z;
import irvine.math.z.ZUtils;
import irvine.oeis.Sequence1;

/**
 * A064438 Numbers which are divisible by the sum of their quaternary digits.
 * @author Sean A. Irvine
 */
public class A064438 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    while (true) {
      if (++mN % ZUtils.digitSum(mN, 4) == 0) {
        return Z.valueOf(mN);
      }
    }
  }
}
