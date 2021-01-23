package irvine.oeis.a006;

import irvine.factor.factor.Jaguar;
import irvine.factor.prime.Fast;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A006514 Primes p such that 2^p - 1 has at most 2 prime factors.
 * @author Sean A. Irvine
 */
public class A006514 implements Sequence {

  private final Fast mPrime = new Fast();
  private long mP = 1;

  @Override
  public Z next() {
    while (true) {
      mP = mPrime.nextPrime(mP);
      final Z n = Z.ONE.shiftLeft((int) mP).subtract(1);
      if (Jaguar.factor(n).omega() < 3) {
        return Z.valueOf(mP);
      }
    }
  }
}
