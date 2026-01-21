package irvine.oeis.a083;

import irvine.factor.prime.Fast;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A083372 Least number having exactly two odd prime factors that differ by 2n.
 * @author Sean A. Irvine
 */
public class A083372 extends Sequence1 {

  private final Fast mPrime = new Fast();
  private long mN = 0;

  @Override
  public Z next() {
    mN += 2;
    long p = 2;
    while (true) {
      p = mPrime.nextPrime(p);
      if (mPrime.isPrime(p + mN)) {
        return Z.valueOf(p).multiply(p + mN);
      }
    }
  }
}
