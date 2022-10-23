package irvine.oeis.a056;

import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A056048 Number of 5-antichain covers of a labeled n-set.
 * @author Sean A. Irvine
 */
public class A056048 extends Sequence0 {

  private static final long[] MULTIPLIERS = {0, 24, -100, 50, 210, -210, 60, -205, 40, 240, 20, -240, 120, 150, -120, -110, 10, 20, 0, 60, 0, 0, 0, -20, 0, 0, 0, 0, 0, 0, 0, 1};
  private long mN = -1;

  @Override
  public Z next() {
    ++mN;
    Z sum = Z.ZERO;
    for (int k = 1; k < MULTIPLIERS.length; ++k) {
      if (MULTIPLIERS[k] != 0) {
        sum = sum.add(Z.valueOf(k).pow(mN).multiply(MULTIPLIERS[k]));
      }
    }
    return sum.divide(120);
  }
}
