package irvine.oeis.a023;

import irvine.math.z.Z;
import irvine.oeis.a000.A000040;

/**
 * A023232 Primes p such that 8*p + 9 is also prime.
 * @author Sean A. Irvine
 */
public class A023232 extends A000040 {

  @Override
  public Z next() {
    while (true) {
      final Z p = super.next();
      if (mPrime.isPrime(p.multiply(8).add(9))) {
        return p;
      }
    }
  }
}
