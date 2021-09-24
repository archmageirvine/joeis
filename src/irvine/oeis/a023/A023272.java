package irvine.oeis.a023;

import irvine.math.z.Z;
import irvine.oeis.a000.A000040;

/**
 * A023272 Primes that remain prime through 3 iterations of the function f(x) = 2*x + 1.
 * @author Sean A. Irvine
 */
public class A023272 extends A000040 {

  @Override
  public Z next() {
    while (true) {
      final Z p = super.next();
      if (mPrime.isPrime(p.multiply2().add(1)) && mPrime.isPrime(p.multiply(4).add(3)) && mPrime.isPrime(p.multiply(8).add(7))) {
        return p;
      }
    }
  }
}
