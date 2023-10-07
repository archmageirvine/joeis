package irvine.oeis.a066;

import irvine.math.z.Z;
import irvine.math.z.ZUtils;
import irvine.oeis.Sequence1;

/**
 * A066282 Numbers k such that k = (product of nonzero digits of k) * (sum of digits of k).
 * @author Sean A. Irvine
 */
public class A066282 extends Sequence1 {

  private long mN = -1;

  @Override
  public Z next() {
    while (true) {
      if (ZUtils.digitNZProduct(++mN, 10) * ZUtils.digitSum(mN) == mN) {
        return Z.valueOf(mN);
      }
    }
  }
}
