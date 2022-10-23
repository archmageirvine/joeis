package irvine.oeis.a054;

import irvine.math.z.Z;
import irvine.math.z.ZUtils;
import irvine.oeis.Sequence1;

/**
 * A054683 Numbers n such that sum of digits is even.
 * @author Sean A. Irvine
 */
public class A054683 extends Sequence1 {

  private long mN = -1;

  @Override
  public Z next() {
    while ((ZUtils.digitSum(++mN) & 1) == 1) {
      // do nothing
    }
    return Z.valueOf(mN);
  }
}
