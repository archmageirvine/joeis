package irvine.oeis.a073;

import irvine.math.z.Z;
import irvine.oeis.a005.A005384;

/**
 * A073434 Primes p such that 2p+1 is prime and there are an even number of primes in the interval [p+1,2p+1].
 * @author Sean A. Irvine
 */
public class A073434 extends A005384 {

  @Override
  public Z next() {
    while (true) {
      final Z p = super.next();
      final Z q = p.multiply2().add(1);
      Z r = p;
      boolean even = true;
      while (r.compareTo(q) < 0) {
        r = mPrime.nextPrime(r);
        even = !even;
      }
      if (even) {
        return p;
      }
    }
  }
}
