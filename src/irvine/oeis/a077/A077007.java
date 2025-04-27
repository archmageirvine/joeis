package irvine.oeis.a077;

import irvine.math.z.Z;
import irvine.oeis.a000.A000040;

/**
 * A077007 Primes p such that p*q+1 or p*q-1 is divisible by r where q = nextprime(p) and r=nextprime(q).
 * @author Sean A. Irvine
 */
public class A077007 extends A000040 {

  @Override
  public Z next() {
    while (true) {
      final Z p = super.next();
      final Z q = mPrime.nextPrime(p);
      final Z r = mPrime.nextPrime(q);
      final Z pq = p.modMultiply(q, r);
      if (pq.equals(Z.ONE) || pq.equals(r.subtract(1))) {
        return p;
      }
    }
  }
}

