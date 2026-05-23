package irvine.oeis.a084;

import irvine.math.z.Z;
import irvine.oeis.a000.A000040;

/**
 * A084952 Middle q of three consecutive primes p,q,r such that (p^2 + q^2 + r^2)/3 is prime.
 * @author Sean A. Irvine
 */
public class A084952 extends A000040 {

  @Override
  public Z next() {
    while (true) {
      final Z p = super.next();
      final Z q = mPrime.nextPrime(p);
      final Z r = mPrime.nextPrime(q);
      if (p.square().add(q.square()).add(r.square()).divide(3).isProbablePrime()) {
        return q;
      }
    }
  }
}
