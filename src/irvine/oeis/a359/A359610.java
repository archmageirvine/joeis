package irvine.oeis.a359;

import irvine.factor.prime.Fast;
import irvine.math.z.Z;
import irvine.math.z.ZUtils;
import irvine.oeis.Sequence1;

/**
 * A359610 Numbers k such that the sum of the 5th powers of the digits of k is prime.
 * @author Sean A. Irvine
 */
public class A359610 extends Sequence1 {

  private final Fast mPrime = new Fast();
  private long mN = 1;

  @Override
  public Z next() {
    while (true) {
      if (mPrime.isPrime(ZUtils.digitSumPower(++mN, 10, 5))) {
        return Z.valueOf(mN);
      }
    }
  }
}
