package irvine.oeis.a020;

import irvine.math.z.Z;
import irvine.math.z.ZUtils;
import irvine.oeis.a000.A000045;

/**
 * A020996.
 * @author Sean A. Irvine
 */
public class A020996 extends A000045 {

  private static final Z TWELVE = Z.valueOf(12);
  private long mN = -1;

  @Override
  public Z next() {
    while (true) {
      if (ZUtils.digitSum(super.next(), TWELVE) == ++mN) {
        return Z.valueOf(mN);
      }
    }
  }
}
