package irvine.oeis.a072;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A072692 Sum of sigma(j) for 1&lt;=j&lt;=10^n, where sigma(j) is the sum of the divisors of j.
 * @author Sean A. Irvine
 */
public class A072692 extends Sequence0 {

  private long mN = 0;
  private long mT = 1;
  private Z mSum = Z.ZERO;

  @Override
  public Z next() {
    while (true) {
      mSum = mSum.add(Functions.SIGMA1.z(++mN));
      if (mN == mT) {
        mT *= 10;
        return mSum;
      }
    }
  }
}
