package irvine.oeis.a024;

import irvine.factor.prime.Fast;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A024895 Numbers k such that 5*k - 3 is prime.
 * @author Sean A. Irvine
 */
public class A024895 extends Sequence1 {

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
