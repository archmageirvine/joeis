package irvine.oeis.a023;

import irvine.math.z.Z;

/**
 * A023319 Primes that remain prime through 4 iterations of function f(x) = 8x + 1.
 * @author Sean A. Irvine
 */
public class A023319 extends A023291 {

  @Override
  public Z next() {
    while (true) {
      final Z p = super.next();
      if (mFast.isPrime(p.multiply(4096).add(585))) {
        return p;
      }
    }
  }
}
