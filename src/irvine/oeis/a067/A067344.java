package irvine.oeis.a067;

import irvine.factor.factor.Jaguar;
import irvine.math.LongUtils;
import irvine.math.z.Z;
import irvine.math.z.ZUtils;
import irvine.oeis.Sequence1;

/**
 * A067344 Sum of decimal digits of square of divisors of n equals sum of square of digits of n.
 * @author Sean A. Irvine
 */
public class A067344 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    while (true) {
      final long sum = LongUtils.digitSumSquares(++mN);
      final long dsum = ZUtils.digitSum(Jaguar.factor(mN).sigma2());
      if (dsum == sum) {
        return Z.valueOf(mN);
      }
    }
  }
}

