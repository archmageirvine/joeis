package irvine.oeis.a028;

import irvine.math.z.Z;
import irvine.math.z.ZUtils;
import irvine.oeis.Sequence;

/**
 * A028838.
 * @author Sean A. Irvine
 */
public class A028838 implements Sequence {

  private long mN = 0;

  @Override
  public Z next() {
    while (true) {
      final long u = ZUtils.digitSum(++mN);
      if ((u & (u - 1)) == 0) {
        return Z.valueOf(mN);
      }
    }
  }
}
