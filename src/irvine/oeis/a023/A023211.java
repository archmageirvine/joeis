package irvine.oeis.a023;

import irvine.math.z.Z;
import irvine.oeis.a000.A000040;

/**
 * A023211 Primes p such that 3*p + 10 is also prime.
 * @author Sean A. Irvine
 */
public class A023211 extends A000040 {

  @Override
  public Z next() {
    while (true) {
      final Z p = super.next();
      if (mPrime.isPrime(p.multiply(3).add(10))) {
        return p;
      }
    }
  }
}
