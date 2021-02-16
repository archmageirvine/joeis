package irvine.oeis.a023;

import irvine.math.z.Z;

/**
 * A023322 Primes that remain prime through 4 iterations of function f(x) = 8x + 7.
 * @author Sean A. Irvine
 */
public class A023322 extends A023294 {

  @Override
  public Z next() {
    while (true) {
      final Z p = super.next();
      if (mFast.isPrime(p.multiply(4096).add(4095))) {
        return p;
      }
    }
  }
}
