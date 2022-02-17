package irvine.oeis.a054;

import irvine.math.z.Z;
import irvine.math.z.ZUtils;
import irvine.oeis.Sequence;

/**
 * A054684 Sum of digits is odd.
 * @author Sean A. Irvine
 */
public class A054684 implements Sequence {

  private long mN = -1;

  @Override
  public Z next() {
    while ((ZUtils.digitSum(++mN) & 1) == 0) {
      // do nothing
    }
    return Z.valueOf(mN);
  }
}
