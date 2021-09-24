package irvine.oeis.a023;

import irvine.math.z.Z;
import irvine.oeis.a000.A000040;

/**
 * A023293 Primes that remain prime through 3 iterations of function f(x) = 8x + 5.
 * @author Sean A. Irvine
 */
public class A023293 extends A000040 {

  @Override
  public Z next() {
    while (true) {
      final Z p = super.next();
      if (mPrime.isPrime(p.multiply(8).add(5)) && mPrime.isPrime(p.multiply(64).add(45)) && mPrime.isPrime(p.multiply(512).add(365))) {
        return p;
      }
    }
  }
}
