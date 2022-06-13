package irvine.oeis.a057;

import irvine.factor.factor.Jaguar;
import irvine.math.z.Z;
import irvine.math.z.ZUtils;
import irvine.oeis.Sequence;

/**
 * A057531 Numbers whose sum of digits and number of divisors are equal.
 * @author Sean A. Irvine
 */
public class A057531 implements Sequence {

  private long mN = 0;

  @Override
  public Z next() {
    while (true) {
      ++mN;
      if (Jaguar.factor(mN).sigma0AsLong() == ZUtils.digitSum(mN)) {
        return Z.valueOf(mN);
      }
    }
  }
}
