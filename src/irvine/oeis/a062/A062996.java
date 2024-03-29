package irvine.oeis.a062;

import irvine.math.z.Z;
import irvine.math.z.ZUtils;
import irvine.oeis.Sequence1;

/**
 * A062996 Sum of digits is greater than or equal to product of digits.
 * @author Sean A. Irvine
 */
public class A062996 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    while (true) {
      if (ZUtils.digitSum(++mN) >= ZUtils.digitProduct(mN)) {
        return Z.valueOf(mN);
      }
    }
  }
}

