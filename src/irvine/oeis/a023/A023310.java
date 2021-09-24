package irvine.oeis.a023;

import irvine.math.z.Z;

/**
 * A023310 Primes that remain prime through 4 iterations of function f(x) = 3x + 10.
 * @author Sean A. Irvine
 */
public class A023310 extends A023280 {

  @Override
  public Z next() {
    while (true) {
      final Z p = super.next();
      if (mPrime.isPrime(p.multiply(81).add(400))) {
        return p;
      }
    }
  }
}
