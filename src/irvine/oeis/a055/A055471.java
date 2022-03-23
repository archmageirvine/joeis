package irvine.oeis.a055;

import irvine.math.z.Z;
import irvine.math.z.ZUtils;
import irvine.oeis.Sequence;

/**
 * A055471 Divisible by the product of its nonzero digits.
 * @author Sean A. Irvine
 */
public class A055471 implements Sequence {

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
