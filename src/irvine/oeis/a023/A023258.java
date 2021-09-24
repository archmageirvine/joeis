package irvine.oeis.a023;

import irvine.math.z.Z;
import irvine.oeis.a000.A000040;

/**
 * A023258 Primes that remain prime through 2 iterations of function f(x) = 6x + 7.
 * @author Sean A. Irvine
 */
public class A023258 extends A000040 {

  @Override
  public Z next() {
    while (true) {
      final Z p = super.next();
      if (mPrime.isPrime(p.multiply(6).add(7)) && mPrime.isPrime(p.multiply(36).add(49))) {
        return p;
      }
    }
  }
}
