package irvine.oeis.a394;

import irvine.math.LongUtils;
import irvine.math.z.Z;
import irvine.oeis.a392.A392091;

/**
 * A394764 allocated for Tsuyoshi Hanatate.
 * @author Sean A. Irvine
 */
public class A394764 extends A392091 {

  private long mN = 1;

  @Override
  public Z next() {
    ++mN;
    Z max = Z.ZERO;
    for (long k = 1; k <= LongUtils.floorLog2(mN); k += 2) {
      max = max.max(t(mN, k + 1).subtract(t(mN, k)).abs());
    }
    return max;
  }
}
