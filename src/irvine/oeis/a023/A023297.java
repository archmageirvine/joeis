package irvine.oeis.a023;

import irvine.math.z.Z;
import irvine.oeis.a000.A000040;

/**
 * A023297 Primes that remain prime through 3 iterations of function f(x) = 9x + 4.
 * @author Sean A. Irvine
 */
public class A023297 extends A000040 {

  @Override
  public Z next() {
    while (true) {
      final Z p = super.next();
      if (mPrime.isPrime(p.multiply(9).add(4)) && mPrime.isPrime(p.multiply(81).add(40)) && mPrime.isPrime(p.multiply(729).add(364))) {
        return p;
      }
    }
  }
}
