package irvine.oeis.a023;

import irvine.math.z.Z;
import irvine.oeis.a000.A000040;

/**
 * A023284 Primes that remain prime through 3 iterations of function f(x) = 5x + 4.
 * @author Sean A. Irvine
 */
public class A023284 extends A000040 {

  @Override
  public Z next() {
    while (true) {
      final Z p = super.next();
      if (mFast.isPrime(p.multiply(5).add(4)) && mFast.isPrime(p.multiply(25).add(24)) && mFast.isPrime(p.multiply(125).add(124))) {
        return p;
      }
    }
  }
}
