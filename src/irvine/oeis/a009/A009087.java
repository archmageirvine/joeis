package irvine.oeis.a009;

import irvine.factor.prime.Fast;
import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A009087 Numbers whose number of divisors is prime (i.e., numbers of the form p^(q-1) for primes p,q).
 * @author Sean A. Irvine
 */
public class A009087 extends Sequence1 {

  private final Fast mPrime = new Fast();
  private long mN = 1;

  @Override
  public Z next() {
    while (true) {
      if (mPrime.isPrime(Functions.SIGMA0.z(++mN))) {
        return Z.valueOf(mN);
      }
    }
  }
}
