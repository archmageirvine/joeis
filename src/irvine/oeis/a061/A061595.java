package irvine.oeis.a061;

import irvine.factor.prime.Fast;
import irvine.math.z.Z;
import irvine.math.z.ZUtils;
import irvine.oeis.Sequence1;

/**
 * A061595 Product of digits + 1 is prime, sum of digits + 1 is prime and sum of digits - 1 is prime.
 * @author Sean A. Irvine
 */
public class A061595 extends Sequence1 {

  private final Fast mPrime = new Fast();
  private long mN = 3;

  @Override
  public Z next() {
    while (true) {
      final long s = ZUtils.digitSum(++mN);
      if (mPrime.isPrime(s - 1) && mPrime.isPrime(s + 1) && mPrime.isPrime(ZUtils.digitProduct(mN) + 1)) {
        return Z.valueOf(mN);
      }
    }
  }
}
