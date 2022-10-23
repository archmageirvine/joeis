package irvine.oeis.a096;

import irvine.math.z.Z;
import irvine.math.z.ZUtils;
import irvine.oeis.Sequence1;

/**
 * A096301 (Product of nonzero digits(sum of digits(n^n)).
 * @author Georg Fischer
 */
public class A096301 extends Sequence1 {

  private int mN = 0;

  @Override
  public Z next() {
    ++mN;
    return ZUtils.digitNZProduct(Z.valueOf(ZUtils.digitSum(Z.valueOf(mN).pow(mN))), 10);
  }
}
