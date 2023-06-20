package irvine.oeis.a064;

import irvine.math.z.Z;
import irvine.math.z.ZUtils;
import irvine.oeis.Sequence1;

/**
 * A064209 Numbers k whose sum of digits exceeds the sum of the digits of k^3.
 * @author Sean A. Irvine
 */
public class A064209 extends Sequence1 {

  private Z mN = Z.ZERO;

  @Override
  public Z next() {
    while (true) {
      mN = mN.add(1);
      if (ZUtils.digitSum(mN) > ZUtils.digitSum(mN.pow(3))) {
        return mN;
      }
    }
  }
}

