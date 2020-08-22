package irvine.oeis.a024;

import irvine.factor.prime.Fast;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A024896 Numbers n such that 5*n - 2 is prime.
 * @author Sean A. Irvine
 */
public class A024896 implements Sequence {

  private final Fast mPrime = new Fast();
  private long mN = 0;

  @Override
  public Z next() {
    while (true) {
      if (mPrime.isPrime(5 * ++mN - 2)) {
        return Z.valueOf(mN);
      }
    }
  }
}
