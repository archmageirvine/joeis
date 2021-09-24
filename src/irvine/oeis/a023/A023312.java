package irvine.oeis.a023;

import irvine.math.z.Z;

/**
 * A023312 Primes that remain prime through 4 iterations of function f(x) = 4x + 9.
 * @author Sean A. Irvine
 */
public class A023312 extends A023282 {

  @Override
  public Z next() {
    while (true) {
      final Z p = super.next();
      if (mPrime.isPrime(p.multiply(256).add(765))) {
        return p;
      }
    }
  }
}
