package irvine.oeis.a028;

import irvine.math.z.Z;
import irvine.math.z.ZUtils;
import irvine.oeis.Sequence;

/**
 * A028841 Iterated sum of digits of n is a Fibonacci number.
 * @author Sean A. Irvine
 */
public class A028841 implements Sequence {

  private long mN = 0;

  @Override
  public Z next() {
    while (true) {
      long u = ++mN;
      while (u > 9) {
        u = ZUtils.digitSum(u);
      }
      if (((0b100101110 >>> u) & 1) == 1) {
        return Z.valueOf(mN);
      }
    }
  }
}
