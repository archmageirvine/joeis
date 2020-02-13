package irvine.oeis.a028;

import irvine.factor.prime.Fast;
import irvine.math.z.Z;
import irvine.math.z.ZUtils;
import irvine.oeis.Sequence;

/**
 * A028835.
 * @author Sean A. Irvine
 */
public class A028835 implements Sequence {

  private final Fast mPrime = new Fast();
  private long mN = 1;

  @Override
  public Z next() {
    while (true) {
      long u = ++mN;
      while (u > 9) {
        u = ZUtils.digitSum(u);
      }
      if (mPrime.isPrime(ZUtils.digitSum(u))) {
        return Z.valueOf(mN);
      }
    }
  }
}
