package irvine.oeis.a023;

import irvine.math.z.Z;
import irvine.oeis.a000.A000040;

/**
 * A023248 Primes that remain prime through 2 iterations of function f(x) = 3x + 8.
 * @author Sean A. Irvine
 */
public class A023248 extends A000040 {

  @Override
  public Z next() {
    while (true) {
      final Z p = super.next();
      if (mPrime.isPrime(p.multiply(3).add(8)) && mPrime.isPrime(p.multiply(9).add(32))) {
        return p;
      }
    }
  }
}
