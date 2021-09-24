package irvine.oeis.a023;

import irvine.math.z.Z;
import irvine.oeis.a000.A000040;

/**
 * A023225 Primes p such that 7*p + 6 is also prime.
 * @author Sean A. Irvine
 */
public class A023225 extends A000040 {

  @Override
  public Z next() {
    while (true) {
      final Z p = super.next();
      if (mPrime.isPrime(p.multiply(7).add(6))) {
        return p;
      }
    }
  }
}
