package irvine.oeis.a023;

import irvine.math.z.Z;
import irvine.oeis.a000.A000040;

/**
 * A023263 Primes that remain prime through 2 iterations of function f(x) = 8x + 7.
 * @author Sean A. Irvine
 */
public class A023263 extends A000040 {

  @Override
  public Z next() {
    while (true) {
      final Z p = super.next();
      if (mPrime.isPrime(p.multiply(8).add(7)) && mPrime.isPrime(p.multiply(64).add(63))) {
        return p;
      }
    }
  }
}
