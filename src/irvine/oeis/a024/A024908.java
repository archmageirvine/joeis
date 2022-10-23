package irvine.oeis.a024;

import irvine.factor.prime.Fast;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A024908 Numbers k such that 9*k - 5 is prime.
 * @author Sean A. Irvine
 */
public class A024908 extends Sequence1 {

  private final Fast mPrime = new Fast();
  private long mN = 1;

  @Override
  public Z next() {
    while (true) {
      if (mPrime.isPrime(9 * ++mN - 5)) {
        return Z.valueOf(mN);
      }
    }
  }
}
