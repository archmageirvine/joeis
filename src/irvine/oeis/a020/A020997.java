package irvine.oeis.a020;

import irvine.math.z.Z;
import irvine.math.z.ZUtils;
import irvine.oeis.a000.A000032;

/**
 * A020997 Numbers n such that the sum of the digits of Lucas(n) is n.
 * @author Sean A. Irvine
 */
public class A020997 extends A000032 {

  private long mN = -1;
  {
    setOffset(1);
  }

  @Override
  public Z next() {
    while (true) {
      if (ZUtils.digitSum(super.next()) == ++mN) {
        return Z.valueOf(mN);
      }
    }
  }
}
