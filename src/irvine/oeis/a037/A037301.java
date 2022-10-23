package irvine.oeis.a037;

import irvine.math.z.Z;
import irvine.math.z.ZUtils;
import irvine.oeis.Sequence1;

/**
 * A037301 Numbers whose base-2 and base-3 expansions have the same digit sum.
 * @author Sean A. Irvine
 */
public class A037301 extends Sequence1 {

  private long mN = -1;

  @Override
  public Z next() {
    while (true) {
      if (ZUtils.digitSum(++mN, 2) == ZUtils.digitSum(mN, 3)) {
        return Z.valueOf(mN);
      }
    }
  }
}

