package irvine.oeis.a390;

import irvine.math.z.Z;
import irvine.oeis.a000.A000040;

/**
 * A390930 Primes p such that the sum of four consecutive primes starting with p and their product is a prime.
 * @author Sean A. Irvine
 */
public class A390930 extends A000040 {

  @Override
  public Z next() {
    while (true) {
      final Z p = super.next();
      final Z q = mPrime.nextPrime(p);
      final Z r = mPrime.nextPrime(q);
      final Z s = mPrime.nextPrime(r);
      final Z t = p.multiply(q).multiply(r).multiply(s).add(p.add(q).add(r).add(s));
      if (t.isProbablePrime()) {
        return p;
      }
    }
  }
}
