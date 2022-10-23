package irvine.oeis.a059;

import irvine.factor.prime.Fast;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A059017 Smallest n-digit prime whose square is a concatenation of two n-digit primes (no leading zeros allowed), 0 if no such prime.
 * @author Sean A. Irvine
 */
public class A059017 extends Sequence1 {

  // After Max Alekseyev

  private final Fast mPrime = new Fast();
  private int mN = 0;

  @Override
  public Z next() {
    final Z v = Z.TEN.pow(mN++);
    final Z u = v.multiply(10);
    Z t = v;
    while (true) {
      t = mPrime.nextPrime(t);
      final Z m = mPrime.nextPrime(t.multiply(u).sqrt());
      final Z s = m.square();
      final Z[] qr = s.divideAndRemainder(u);
      if (qr[0].equals(t) && qr[1].compareTo(v) > 0 && qr[1].isProbablePrime()) {
        return m;
      }
    }
  }
}
