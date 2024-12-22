package irvine.oeis.a073;

import irvine.factor.prime.Fast;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A073828.
 * @author Sean A. Irvine
 */
public class A073839 extends Sequence1 {

  private final Fast mPrime = new Fast();
  private long mN = 0;

  @Override
  public Z next() {
    Z sum = Z.ZERO;
    if (++mN > 1) {
      for (long k = mN; k <= 2 * mN; ++k) {
        if (!mPrime.isPrime(k)) {
          sum = sum.add(k);
        }
      }
    }
    return sum;
  }
}
