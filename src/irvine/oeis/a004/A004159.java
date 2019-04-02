package irvine.oeis.a004;

import irvine.math.z.Z;
import irvine.math.z.ZUtils;
import irvine.oeis.Sequence;

/**
 * A004159 Sum of digits of n^2.
 * @author Sean A. Irvine
 */
public class A004159 implements Sequence {

  private long mN = -1;

  @Override
  public Z next() {
    return Z.valueOf(ZUtils.digitSum(Z.valueOf(++mN).square()));
  }
}
