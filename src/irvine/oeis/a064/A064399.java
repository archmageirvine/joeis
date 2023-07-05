package irvine.oeis.a064;

import irvine.math.z.Z;
import irvine.math.z.ZUtils;
import irvine.oeis.Sequence1;

/**
 * A064399 Numbers k whose sum of digits exceeds the sum of the digits of k^2.
 * @author Sean A. Irvine
 */
public class A064399 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    while (true) {
      if (ZUtils.digitSum(++mN) > ZUtils.digitSum(mN * mN)) {
        return Z.valueOf(mN);
      }
    }
  }
}

