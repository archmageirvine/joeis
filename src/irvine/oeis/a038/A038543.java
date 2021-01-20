package irvine.oeis.a038;

import irvine.factor.prime.Fast;
import irvine.math.z.Z;
import irvine.oeis.a000.A000594;

/**
 * A038543 Primes p such that Ramanujan function tau(p) is divisible by 13.
 * @author Sean A. Irvine
 */
public class A038543 extends A000594 {

  private final Fast mPrime = new Fast();
  private long mN = 0;

  @Override
  public Z next() {
    while (true) {
      ++mN;
      if (super.next().mod(13) == 0 && mPrime.isPrime(mN)) {
        return Z.valueOf(mN);
      }
    }
  }
}
