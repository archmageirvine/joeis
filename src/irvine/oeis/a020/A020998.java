package irvine.oeis.a020;

import irvine.math.z.Z;
import irvine.math.z.ZUtils;
import irvine.oeis.a000.A000032;

/**
 * A020998 Numbers n such that the sum of the digits of <code>Lucas(n)</code> in base 12 is n.
 * @author Sean A. Irvine
 */
public class A020998 extends A000032 {

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
