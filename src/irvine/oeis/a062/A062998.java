package irvine.oeis.a062;

import irvine.math.z.Z;
import irvine.math.z.ZUtils;
import irvine.oeis.Sequence1;

/**
 * A062998 Numbers with property that sum of digits is less than or equal to product of digits.
 * @author Sean A. Irvine
 */
public class A062998 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    while (true) {
      if (ZUtils.digitSum(++mN) <= ZUtils.digitProduct(mN)) {
        return Z.valueOf(mN);
      }
    }
  }
}

