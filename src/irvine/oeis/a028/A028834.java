package irvine.oeis.a028;

import irvine.factor.prime.Fast;
import irvine.math.z.Z;
import irvine.math.z.ZUtils;
import irvine.oeis.Sequence;

/**
 * A028834 Numbers n such that sum of digits of n is a prime.
 * @author Sean A. Irvine
 */
public class A028834 implements Sequence {

  private final Fast mPrime = new Fast();
  private long mN = 1;

  @Override
  public Z next() {
    while (true) {
      if (mPrime.isPrime(ZUtils.digitSum(++mN))) {
        return Z.valueOf(mN);
      }
    }
  }
}
