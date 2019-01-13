package irvine.oeis.a005;

import irvine.math.z.Z;
import irvine.math.z.ZUtils;
import irvine.oeis.Sequence;

/**
 * A005349.
 * @author Sean A. Irvine
 */
public class A005349 implements Sequence {

  private long mN = 0;

  @Override
  public Z next() {
    while (true) {
      final long d = ZUtils.digitSum(++mN);
      if (mN % d == 0) {
        return Z.valueOf(mN);
      }
    }
  }
}
