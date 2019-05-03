package irvine.oeis.a009;

import irvine.factor.factor.Cheetah;
import irvine.factor.prime.Fast;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A009087 Numbers n such that the number of divisors of n is prime <code>(i.e.</code>, numbers of the form <code>p^(q-1)</code> for primes <code>p,q)</code>.
 * @author Sean A. Irvine
 */
public class A009087 implements Sequence {

  private final Fast mPrime = new Fast();
  private long mN = 1;

  @Override
  public Z next() {
    while (true) {
      if (mPrime.isPrime(Cheetah.factor(++mN).sigma0())) {
        return Z.valueOf(mN);
      }
    }
  }
}
