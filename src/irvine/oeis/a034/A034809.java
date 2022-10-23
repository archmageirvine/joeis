package irvine.oeis.a034;

import irvine.factor.prime.Fast;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A034809 Numbers k such that the concatenation of k and previous_prime(k) is a prime.
 * @author Sean A. Irvine
 */
public class A034809 extends Sequence1 {

  private final Fast mPrime = new Fast();
  private long mN = 3;

  @Override
  public Z next() {
    while (true) {
      if (new Z(String.valueOf(++mN) + mPrime.prevPrime(mN)).isProbablePrime()) {
        return Z.valueOf(mN);
      }
    }
  }
}
