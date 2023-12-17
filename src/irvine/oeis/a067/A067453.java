package irvine.oeis.a067;

import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.math.z.ZUtils;
import irvine.oeis.Sequence0;

/**
 * A067229.
 * @author Sean A. Irvine
 */
public class A067453 extends Sequence0 {

  private long mN = -1;

  @Override
  public Z next() {
    final long sum = ZUtils.digitSum(++mN);
    final long prod = ZUtils.digitNZProduct(mN, 10);
    return Binomial.binomial(Math.max(sum, prod), Math.min(sum, prod));
  }
}
