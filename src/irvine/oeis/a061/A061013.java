package irvine.oeis.a061;

import irvine.math.z.Z;
import irvine.math.z.ZUtils;
import irvine.oeis.Sequence1;

/**
 * A061013 Numbers k such that (product of digits of k) is divisible by (sum of digits of k), where 0's are not permitted.
 * @author Sean A. Irvine
 */
public class A061013 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    while (true) {
      final long p = ZUtils.digitProduct(++mN);
      if (p != 0 && p % ZUtils.digitSum(mN) == 0) {
        return Z.valueOf(mN);
      }
    }
  }
}

