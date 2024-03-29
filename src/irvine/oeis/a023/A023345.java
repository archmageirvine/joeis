package irvine.oeis.a023;

import irvine.math.z.Z;

/**
 * A023345 Primes that remain prime through 5 iterations of function f(x) = 6x + 5.
 * @author Sean A. Irvine
 */
public class A023345 extends A023317 {

  @Override
  public Z next() {
    while (true) {
      final Z p = super.next();
      if (mPrime.isPrime(p.multiply(7776).add(7775))) {
        return p;
      }
    }
  }
}
