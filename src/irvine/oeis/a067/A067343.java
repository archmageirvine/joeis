package irvine.oeis.a067;

import irvine.factor.factor.Jaguar;
import irvine.math.z.Z;
import irvine.math.z.ZUtils;
import irvine.oeis.Sequence1;

/**
 * A067343 Sum of decimal digits of n equals sum of decimal digits of sum of divisors of n.
 * @author Sean A. Irvine
 */
public class A067343 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    while (true) {
      final long sum = ZUtils.digitSum(++mN);
      final long dsum = ZUtils.digitSum(Jaguar.factor(mN).sigma());
      if (dsum == sum) {
        return Z.valueOf(mN);
      }
    }
  }
}

