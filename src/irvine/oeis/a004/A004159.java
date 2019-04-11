package irvine.oeis.a004;

import irvine.math.z.Z;
import irvine.math.z.ZUtils;
import irvine.oeis.Sequence;

/**
 * A004159 Sum of digits of <code>n^2</code>.
 * @author Sean A. Irvine
 */
public class A004159 implements Sequence {

  private long mN = -1;

  @Override
  public Z next() {
    return Z.valueOf(ZUtils.digitSum(Z.valueOf(++mN).square()));
  }
}
