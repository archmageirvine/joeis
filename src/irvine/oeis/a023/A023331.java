package irvine.oeis.a023;

import irvine.math.z.Z;

/**
 * A023331 Primes that remain prime through 5 iterations of function f(x) = 2x + 3.
 * @author Sean A. Irvine
 */
public class A023331 extends A023303 {

  @Override
  public Z next() {
    while (true) {
      final Z p = super.next();
      if (mPrime.isPrime(p.multiply(32).add(93))) {
        return p;
      }
    }
  }
}
