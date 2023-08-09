package irvine.oeis.a065;

import irvine.factor.prime.Fast;
import irvine.math.z.Z;
import irvine.oeis.a000.A000720;

/**
 * A065042 Numbers k such that prime(k) + pi(k) is a prime.
 * @author Sean A. Irvine
 */
public class A065042 extends A000720 {

  private final Fast mPrime = new Fast();
  private long mP = 1;
  private long mN = 0;

  @Override
  public Z next() {
    while (true) {
      ++mN;
      mP = mPrime.nextPrime(mP);
      if (super.next().add(mP).isProbablePrime()) {
        return Z.valueOf(mN);
      }
    }
  }
}

