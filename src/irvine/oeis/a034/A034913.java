package irvine.oeis.a034;

import irvine.factor.prime.Fast;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A034913 Odd primes p such that q = (k*p+1)/(p-k) is prime for some p/2 &lt; k &lt; p.
 * @author Sean A. Irvine
 */
public class A034913 implements Sequence {

  private final Fast mPrime = new Fast();
  private long mP = 2;

  @Override
  public Z next() {
    while (true) {
      mP = mPrime.nextPrime(mP);
      final Z p = Z.valueOf(mP);
      for (long k = mP - 1; 2 * k >= mP; --k) {
        final Z a = p.multiply(k).add(1);
        final Z[] qr = a.divideAndRemainder(Z.valueOf(mP - k));
        if (qr[1].isZero() && qr[0].isProbablePrime()) {
          return p;
        }
      }
    }
  }
}
