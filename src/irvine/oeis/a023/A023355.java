package irvine.oeis.a023;

import irvine.math.z.Z;

/**
 * A023355 Primes that remain prime through 5 iterations of function f(x) = 9x + 10.
 * @author Sean A. Irvine
 */
public class A023355 extends A023327 {

  @Override
  public Z next() {
    while (true) {
      final Z p = super.next();
      if (mFast.isPrime(p.multiply(59049).add(73810))) {
        return p;
      }
    }
  }
}
