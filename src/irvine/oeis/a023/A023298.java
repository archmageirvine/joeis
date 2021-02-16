package irvine.oeis.a023;

import irvine.math.z.Z;
import irvine.oeis.a000.A000040;

/**
 * A023298 Primes that remain prime through 3 iterations of function f(x) = 9x + 8.
 * @author Sean A. Irvine
 */
public class A023298 extends A000040 {

  @Override
  public Z next() {
    while (true) {
      final Z p = super.next();
      if (mFast.isPrime(p.multiply(9).add(8)) && mFast.isPrime(p.multiply(81).add(80)) && mFast.isPrime(p.multiply(729).add(728))) {
        return p;
      }
    }
  }
}
