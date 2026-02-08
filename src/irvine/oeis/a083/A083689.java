package irvine.oeis.a083;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.math.z.ZUtils;
import irvine.oeis.Sequence1;

/**
 * A083689 Numbers n such that the sum of the factorials of the digits of n! is prime.
 * @author Sean A. Irvine
 */
public class A083689 extends Sequence1 {

  private Z mF = Z.ONE;
  private long mN = 1;

  private Z factorialDigitSum(final Z n) {
    final int[] cnts = ZUtils.digitCounts(n);
    Z sum = Z.ZERO;
    for (int k = 0; k < cnts.length; ++k) {
      sum = sum.add(Functions.FACTORIAL.z(k).multiply(cnts[k]));
    }
    return sum;
  }

  @Override
  public Z next() {
    while (true) {
      mF = mF.multiply(++mN);
      if (factorialDigitSum(mF).isProbablePrime()) {
        return Z.valueOf(mN);
      }
    }
  }
}
