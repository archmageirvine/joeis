package irvine.oeis.a023;

import irvine.math.z.Z;

/**
 * A023340 Primes that remain prime through 5 iterations of function f(x) = 4x + 9.
 * @author Sean A. Irvine
 */
public class A023340 extends A023312 {

  @Override
  public Z next() {
    while (true) {
      final Z p = super.next();
      if (mFast.isPrime(p.multiply(1024).add(3069))) {
        return p;
      }
    }
  }
}
