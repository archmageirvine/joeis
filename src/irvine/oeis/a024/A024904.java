package irvine.oeis.a024;

import irvine.factor.prime.Fast;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A024904 Numbers k such that 7*k - 5 is prime.
 * @author Sean A. Irvine
 */
public class A024904 extends Sequence1 {

  private final Fast mPrime = new Fast();
  private long mN = 0;

  @Override
  public Z next() {
    while (true) {
      if (mPrime.isPrime(7 * ++mN - 5)) {
        return Z.valueOf(mN);
      }
    }
  }
}
