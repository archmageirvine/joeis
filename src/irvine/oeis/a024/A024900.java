package irvine.oeis.a024;

import irvine.factor.prime.Fast;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A024900 Numbers n such that 7*n+6 is prime.
 * @author Sean A. Irvine
 */
public class A024900 implements Sequence {

  private final Fast mPrime = new Fast();
  private long mN = 0;

  @Override
  public Z next() {
    while (true) {
      if (mPrime.isPrime(7 * ++mN + 6)) {
        return Z.valueOf(mN);
      }
    }
  }
}
