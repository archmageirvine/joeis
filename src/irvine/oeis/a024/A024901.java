package irvine.oeis.a024;

import irvine.factor.prime.Fast;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A024901 Numbers k such that 7*k - 2 is prime.
 * @author Sean A. Irvine
 */
public class A024901 implements Sequence {

  private final Fast mPrime = new Fast();
  private long mN = 0;

  @Override
  public Z next() {
    while (true) {
      if (mPrime.isPrime(7 * ++mN - 2)) {
        return Z.valueOf(mN);
      }
    }
  }
}
