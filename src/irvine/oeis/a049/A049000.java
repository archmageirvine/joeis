package irvine.oeis.a049;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A049000 Sum of sigma(j) for 1&lt;=j&lt;10^n, where sigma(j) is the sum of divisors of j.
 * @author Sean A. Irvine
 */
public class A049000 extends Sequence0 {

  private long mN = 0;
  private long mT = 1;
  private Z mSum = Z.ZERO;

  @Override
  public Z next() {
    while (true) {
      final Z res = mSum;
      mSum = mSum.add(Functions.SIGMA.z(++mN));
      if (mN == mT) {
        mT *= 10;
        return res;
      }
    }
  }
}
