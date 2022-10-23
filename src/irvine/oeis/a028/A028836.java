package irvine.oeis.a028;

import irvine.math.z.Z;
import irvine.math.z.ZUtils;
import irvine.oeis.Sequence1;

/**
 * A028836 Iterated sum of digits of n is a power of 2.
 * @author Sean A. Irvine
 */
public class A028836 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    while (true) {
      long u = ++mN;
      while (u > 9) {
        u = ZUtils.digitSum(u);
      }
      if ((u & (u - 1)) == 0) {
        return Z.valueOf(mN);
      }
    }
  }
}
