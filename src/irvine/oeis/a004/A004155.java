package irvine.oeis.a004;

import irvine.math.z.Z;
import irvine.math.z.ZUtils;
import irvine.oeis.Sequence0;

/**
 * A004155 Sum of digits of n-th odd number.
 * @author Sean A. Irvine
 */
public class A004155 extends Sequence0 {

  private long mN = -1;

  @Override
  public Z next() {
    mN += 2;
    return Z.valueOf(ZUtils.digitSum(mN));
  }
}
