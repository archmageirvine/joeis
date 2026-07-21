package irvine.oeis.a086;

import irvine.math.z.Z;
import irvine.oeis.a000.A000040;

/**
 * A086041 Primes that are concatenations of 5 consecutive primes.
 * @author Sean A. Irvine
 */
public class A086041 extends A000040 {

  @Override
  public Z next() {
    while (true) {
      final Z p = super.next();
      final Z q = mPrime.nextPrime(p);
      final Z r = mPrime.nextPrime(q);
      final Z s = mPrime.nextPrime(r);
      final Z t = new Z(p.toString() + q + r + s + mPrime.nextPrime(s));
      if (t.isProbablePrime()) {
        return t;
      }
    }
  }
}
