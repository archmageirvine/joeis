package irvine.oeis.a062;

import irvine.math.z.Z;
import irvine.math.z.ZUtils;
import irvine.oeis.Sequence1;

/**
 * A062501.
 * @author Sean A. Irvine
 */
public class A062519 extends Sequence1 {

  private long mN = 35;

  @Override
  public Z next() {
    while (true) {
      final long prod = ZUtils.digitProduct(++mN);
      final long sum = ZUtils.digitSum(mN);
      if (prod % sum == 0 && prod / sum > 1) {
        return Z.valueOf(mN);
      }
    }
  }
}
