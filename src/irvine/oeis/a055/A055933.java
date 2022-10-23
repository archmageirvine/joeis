package irvine.oeis.a055;

import irvine.math.z.Z;
import irvine.math.z.ZUtils;
import irvine.oeis.Sequence1;

/**
 * A055933 Product of digits (not counting zeros) of n divides sum of digits of n.
 * @author Sean A. Irvine
 */
public class A055933 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    while (true) {
      if (ZUtils.digitSum(++mN) % ZUtils.digitNZProduct(mN, 10) == 0) {
        return Z.valueOf(mN);
      }
    }
  }
}
