package irvine.oeis.a025;

import irvine.math.z.Z;
import irvine.math.z.ZUtils;
import irvine.oeis.a000.A000045;

/**
 * A025490 Numbers k such that the sum of the digits of <code>Fibonacci(k)</code> in base 11 is k.
 * @author Sean A. Irvine
 */
public class A025490 extends A000045 {

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
