package irvine.oeis.a005;

import irvine.math.z.Z;
import irvine.math.z.ZUtils;
import irvine.oeis.Sequence1;

/**
 * A005349 Niven (or Harshad, or harshad) numbers: numbers that are divisible by the sum of their digits.
 * @author Sean A. Irvine
 */
public class A005349 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    while (true) {
      final long d = ZUtils.digitSum(++mN);
      if (mN % d == 0) {
        return Z.valueOf(mN);
      }
    }
  }
}
