package irvine.oeis.a066;

import irvine.factor.prime.Fast;
import irvine.math.z.Z;
import irvine.math.z.ZUtils;
import irvine.oeis.Sequence1;

/**
 * A066027 Sum of digits of n minus product of digits of n is prime.
 * @author Sean A. Irvine
 */
public class A066027 extends Sequence1 {

  private final Fast mPrime = new Fast();
  private long mN = 0;

  @Override
  public Z next() {
    while (true) {
      if (mPrime.isPrime(ZUtils.digitSum(++mN) - ZUtils.digitProduct(mN))) {
        return Z.valueOf(mN);
      }
    }
  }
}
