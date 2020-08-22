package irvine.oeis.a020;

import irvine.math.z.Z;
import irvine.math.z.ZUtils;
import irvine.oeis.a000.A000045;

/**
 * A020996 Numbers k such that the sum of the digits of Fibonacci(k) in base 12 is k.
 * @author Sean A. Irvine
 */
public class A020996 extends A000045 {

  private long mN = -1;

  @Override
  public Z next() {
    while (true) {
      if (ZUtils.digitSum(super.next(), 12) == ++mN) {
        return Z.valueOf(mN);
      }
    }
  }
}
