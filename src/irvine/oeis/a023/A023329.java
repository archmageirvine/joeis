package irvine.oeis.a023;

import irvine.math.z.Z;

/**
 * A023329 Primes that remain prime through 4 iterations of function f(x) = 10x + 9.
 * @author Sean A. Irvine
 */
public class A023329 extends A023301 {

  @Override
  public Z next() {
    while (true) {
      final Z p = super.next();
      if (mFast.isPrime(p.multiply(10000).add(9999))) {
        return p;
      }
    }
  }
}
