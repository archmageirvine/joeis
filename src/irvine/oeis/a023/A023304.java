package irvine.oeis.a023;

import irvine.math.z.Z;

/**
 * A023304 Primes that remain prime through 4 iterations of function f(x) = 2x + 5.
 * @author Sean A. Irvine
 */
public class A023304 extends A023274 {

  @Override
  public Z next() {
    while (true) {
      final Z p = super.next();
      if (mPrime.isPrime(p.multiply(16).add(75))) {
        return p;
      }
    }
  }
}
