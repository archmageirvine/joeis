package irvine.oeis.a014;

import irvine.factor.prime.Fast;
import irvine.math.z.Z;
import irvine.oeis.a001.A001608;

/**
 * A014981.
 * @author Sean A. Irvine
 */
public class A014981 extends A001608 {

  private final Fast mPrime = new Fast();
  private long mN = -1;

  @Override
  public Z next() {
    while (true) {
      if (mPrime.isPrime(++mN)) {
        return super.next().divide(mN);
      }
      super.next();
    }
  }
}
