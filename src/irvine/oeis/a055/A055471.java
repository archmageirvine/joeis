package irvine.oeis.a055;

import irvine.math.z.Z;
import irvine.math.z.ZUtils;
import irvine.oeis.Sequence1;

/**
 * A055471 Divisible by the product of its nonzero digits.
 * @author Sean A. Irvine
 */
public class A055471 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    while (true) {
      if (++mN % ZUtils.digitNZProduct(mN, 10) == 0) {
        return Z.valueOf(mN);
      }
    }
  }
}
