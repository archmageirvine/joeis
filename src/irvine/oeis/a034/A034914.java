package irvine.oeis.a034;

import irvine.factor.prime.Fast;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A034914 Odd primes p such that q=(k*p+1)/(p-k) is prime for some k.
 * @author Sean A. Irvine
 */
public class A034914 extends Sequence1 {

  private final Fast mPrime = new Fast();
  private long mP = 2;

  @Override
  public Z next() {
    while (true) {
      mP = mPrime.nextPrime(mP);
      final Z p = Z.valueOf(mP);
      for (long k = mP - 1; k >= 1; --k) {
        final Z a = p.multiply(k).add(1);
        final Z[] qr = a.divideAndRemainder(Z.valueOf(mP - k));
        if (qr[1].isZero() && qr[0].isProbablePrime()) {
          return p;
        }
      }
    }
  }
}
