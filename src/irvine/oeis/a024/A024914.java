package irvine.oeis.a024;

import irvine.factor.prime.Fast;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A024914 Numbers k such that 10*k - 3 is prime.
 * @author Sean A. Irvine
 */
public class A024914 implements Sequence {

  private final Fast mPrime = new Fast();
  private long mN = 0;

  @Override
  public Z next() {
    while (true) {
      if (mPrime.isPrime(10 * ++mN - 3)) {
        return Z.valueOf(mN);
      }
    }
  }
}
