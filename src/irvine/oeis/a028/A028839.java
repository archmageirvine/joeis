package irvine.oeis.a028;

import irvine.math.LongUtils;
import irvine.math.z.Z;
import irvine.math.z.ZUtils;
import irvine.oeis.Sequence;

/**
 * A028839 Sum of digits of n is a square.
 * @author Sean A. Irvine
 */
public class A028839 implements Sequence {

  private long mN = 0;

  @Override
  public Z next() {
    while (true) {
      final long u = ZUtils.digitSum(++mN);
      final long s = LongUtils.sqrt(u);
      if (s * s == u) {
        return Z.valueOf(mN);
      }
    }
  }
}
