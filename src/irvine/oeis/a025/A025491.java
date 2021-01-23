package irvine.oeis.a025;

import irvine.math.z.Z;
import irvine.math.z.ZUtils;
import irvine.oeis.a000.A000032;

/**
 * A025491 In base 11, a(n) = sum of digits of Lucas(a(n)).
 * @author Sean A. Irvine
 */
public class A025491 extends A000032 {

  private long mN = -1;

  @Override
  public Z next() {
    while (true) {
      if (ZUtils.digitSum(super.next(), 11) == ++mN) {
        return Z.valueOf(mN);
      }
    }
  }
}
