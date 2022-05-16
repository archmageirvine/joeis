package irvine.oeis.a049;

import irvine.factor.factor.Jaguar;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A049000 Sum of sigma(j) for 1&lt;=j&lt;10^n, where sigma(j) is the sum of divisors of j.
 * @author Sean A. Irvine
 */
public class A049000 implements Sequence {

  private long mN = 0;
  private long mT = 1;
  private Z mSum = Z.ZERO;

  @Override
  public Z next() {
    while (true) {
      final Z res = mSum;
      mSum = mSum.add(Jaguar.factor(++mN).sigma());
      if (mN == mT) {
        mT *= 10;
        return res;
      }
    }
  }
}
