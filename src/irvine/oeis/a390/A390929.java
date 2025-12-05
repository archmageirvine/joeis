package irvine.oeis.a390;

import irvine.math.z.Z;
import irvine.oeis.a000.A000040;

/**
 * A390929 Primes p such that, if q,r,s are the next three primes, both p*q*r*s - (p+q+r+s) and p*q*r*s + (p+q+r+s) are primes.
 * @author Sean A. Irvine
 */
public class A390929 extends A000040 {

  @Override
  public Z next() {
    while (true) {
      final Z p = super.next();
      final Z q = mPrime.nextPrime(p);
      final Z r = mPrime.nextPrime(q);
      final Z s = mPrime.nextPrime(r);
      final Z prod = p.multiply(q).multiply(r).multiply(s);
      final Z sum = p.add(q).add(r).add(s);
      if (prod.subtract(sum).isProbablePrime() && prod.add(sum).isProbablePrime()) {
        return p;
      }
    }
  }
}
