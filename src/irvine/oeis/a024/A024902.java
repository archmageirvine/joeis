package irvine.oeis.a024;

import irvine.factor.prime.Fast;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A024902 Numbers k such that 7*k + 4 is prime.
 * @author Sean A. Irvine
 */
public class A024902 implements Sequence {

  private final Fast mPrime = new Fast();
  private long mN = 0;

  @Override
  public Z next() {
    while (true) {
      if (mPrime.isPrime(7 * ++mN + 4)) {
        return Z.valueOf(mN);
      }
    }
  }
}
