package irvine.oeis.a023;

import irvine.math.z.Z;
import irvine.oeis.a000.A000040;

/**
 * A023229 Primes p such that 8*p + 3 is also prime.
 * @author Sean A. Irvine
 */
public class A023229 extends A000040 {

  @Override
  public Z next() {
    while (true) {
      final Z p = super.next();
      if (mPrime.isPrime(p.multiply(8).add(3))) {
        return p;
      }
    }
  }
}
