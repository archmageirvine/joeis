package irvine.oeis.a074;

import irvine.math.z.Z;
import irvine.oeis.a000.A000040;

/**
 * A074965 Primes p for which there is an integer k such that (2*k+1)*p=2*k*q+1, where q is the next prime after p. Equivalently, (p-1)/(2*(q-p)) is an integer.
 * @author Sean A. Irvine
 */
public class A074965 extends A000040 {

  @Override
  public Z next() {
    while (true) {
      final Z p = super.next();
      final Z q = mPrime.nextPrime(p);
      if (p.subtract(1).mod(q.subtract(p).multiply2()).isZero()) {
        return p;
      }
    }
  }
}
