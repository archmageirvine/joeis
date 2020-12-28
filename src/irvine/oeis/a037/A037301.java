package irvine.oeis.a037;

import irvine.math.z.Z;
import irvine.math.z.ZUtils;
import irvine.oeis.Sequence;

/**
 * A037301 Numbers k such that the sum of base 2 digits of k equals the sum of base 3 digits of k.
 * @author Sean A. Irvine
 */
public class A037301 implements Sequence {

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

