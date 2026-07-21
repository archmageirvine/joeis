package irvine.oeis.a086;

import irvine.math.z.Z;
import irvine.oeis.a000.A000040;

/**
 * A086040 Prime p concatenated with next 4 primes is also prime.
 * @author Sean A. Irvine
 */
public class A086040 extends A000040 {

  @Override
  public Z next() {
    while (true) {
      final Z p = super.next();
      final Z q = mPrime.nextPrime(p);
      final Z r = mPrime.nextPrime(q);
      final Z s = mPrime.nextPrime(r);
      if (new Z(p.toString() + q + r + s + mPrime.nextPrime(s)).isProbablePrime()) {
        return p;
      }
    }
  }
}
