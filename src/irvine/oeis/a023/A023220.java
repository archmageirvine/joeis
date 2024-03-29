package irvine.oeis.a023;

import irvine.math.z.Z;
import irvine.oeis.a000.A000040;

/**
 * A023220 Primes p such that 5*p + 8 is also prime.
 * @author Sean A. Irvine
 */
public class A023220 extends A000040 {

  @Override
  public Z next() {
    while (true) {
      final Z p = super.next();
      if (mPrime.isPrime(p.multiply(5).add(8))) {
        return p;
      }
    }
  }
}
