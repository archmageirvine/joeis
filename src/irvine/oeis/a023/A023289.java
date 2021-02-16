package irvine.oeis.a023;

import irvine.math.z.Z;
import irvine.oeis.a000.A000040;

/**
 * A023289 Primes that remain prime through 3 iterations of function f(x) = 6x + 7.
 * @author Sean A. Irvine
 */
public class A023289 extends A000040 {

  @Override
  public Z next() {
    while (true) {
      final Z p = super.next();
      if (mFast.isPrime(p.multiply(6).add(7)) && mFast.isPrime(p.multiply(36).add(49)) && mFast.isPrime(p.multiply(216).add(301))) {
        return p;
      }
    }
  }
}
