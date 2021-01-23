package irvine.oeis.a024;

import irvine.factor.prime.Fast;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A024895 Numbers n such that 5*n-3 is prime.
 * @author Sean A. Irvine
 */
public class A024895 implements Sequence {

  private final Fast mPrime = new Fast();
  private long mN = 0;

  @Override
  public Z next() {
    while (true) {
      if (mPrime.isPrime(5 * ++mN - 3)) {
        return Z.valueOf(mN);
      }
    }
  }
}
