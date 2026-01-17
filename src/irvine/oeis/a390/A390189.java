package irvine.oeis.a390;

import irvine.math.predicate.Predicates;
import irvine.math.z.Z;
import irvine.oeis.a000.A000040;

/**
 * A390189 Primes k such that k-2 is a semiprime and k+2 is the product of 4 consecutive primes.
 * @author Sean A. Irvine
 */
public class A390189 extends A000040 {

  @Override
  public Z next() {
    while (true) {
      final Z p = super.next();
      final Z q = mPrime.nextPrime(p);
      final Z r = mPrime.nextPrime(q);
      final Z s = mPrime.nextPrime(r);
      final Z prod = s.multiply(r).multiply(q).multiply(p);
      if (prod.subtract(2).isProbablePrime() && Predicates.SEMIPRIME.is(prod.subtract(4))) {
        return prod.subtract(2);
      }
    }
  }
}
