package irvine.oeis.a076;

import irvine.math.z.Z;
import irvine.oeis.a000.A000040;

/**
 * A076814 Integer averages of five successive primes squared, (prime(n)^2+prime(n+1)^2+prime(n+2)^2+prime(n+3)^2+prime(n+4)^2)/5, for some n.
 * @author Sean A. Irvine
 */
public class A076814 extends A000040 {

  @Override
  public Z next() {
    while (true) {
      final Z p = super.next();
      final Z q = mPrime.nextPrime(p);
      final Z r = mPrime.nextPrime(q);
      final Z s = mPrime.nextPrime(r);
      final Z t = mPrime.nextPrime(s);
      final Z c = p.square().add(q.square()).add(r.square()).add(s.square()).add(t.square());
      final Z[] qr = c.divideAndRemainder(Z.FIVE);
      if (qr[1].isZero()) {
        return qr[0];
      }
    }
  }
}

