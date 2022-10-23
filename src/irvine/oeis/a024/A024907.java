package irvine.oeis.a024;

import irvine.factor.prime.Fast;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A024907 Numbers k such that 9*k - 7 is prime.
 * @author Sean A. Irvine
 */
public class A024907 extends Sequence1 {

  private final Fast mPrime = new Fast();
  private long mN = 0;

  @Override
  public Z next() {
    while (true) {
      if (mPrime.isPrime(9 * ++mN - 7)) {
        return Z.valueOf(mN);
      }
    }
  }
}
