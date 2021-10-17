package irvine.oeis.a052;

import irvine.factor.prime.Fast;
import irvine.math.z.Z;
import irvine.math.z.ZUtils;
import irvine.oeis.Sequence;

/**
 * A052020 Sum of digits of n is a prime proper factor of n.
 * @author Sean A. Irvine
 */
public class A052020 implements Sequence {

  private final Fast mPrime = new Fast();
  private long mN = 11;

  @Override
  public Z next() {
    while (true) {
      final long sum = ZUtils.digitSum(++mN);
      if (sum != mN && mN % sum == 0 && mPrime.isPrime(sum)) {
        return Z.valueOf(mN);
      }
    }
  }
}
