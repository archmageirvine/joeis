package irvine.oeis.a024;

import irvine.factor.prime.Fast;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A024913 Numbers n such that 10n - 7 is prime.
 * @author Sean A. Irvine
 */
public class A024913 implements Sequence {

  private final Fast mPrime = new Fast();
  private long mN = 0;

  @Override
  public Z next() {
    while (true) {
      if (mPrime.isPrime(10 * ++mN - 7)) {
        return Z.valueOf(mN);
      }
    }
  }
}
