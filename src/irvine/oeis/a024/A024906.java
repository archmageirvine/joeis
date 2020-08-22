package irvine.oeis.a024;

import irvine.factor.prime.Fast;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A024906 Numbers k such that 9*k + 1 is prime.
 * @author Sean A. Irvine
 */
public class A024906 implements Sequence {

  private final Fast mPrime = new Fast();
  private long mN = 1;

  @Override
  public Z next() {
    while (true) {
      if (mPrime.isPrime(9 * ++mN + 1)) {
        return Z.valueOf(mN);
      }
    }
  }
}
