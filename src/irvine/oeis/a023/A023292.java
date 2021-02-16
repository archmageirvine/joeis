package irvine.oeis.a023;

import irvine.math.z.Z;
import irvine.oeis.a000.A000040;

/**
 * A023292 Primes that remain prime through 3 iterations of function f(x) = 8x + 3.
 * @author Sean A. Irvine
 */
public class A023292 extends A000040 {

  @Override
  public Z next() {
    while (true) {
      final Z p = super.next();
      if (mFast.isPrime(p.multiply(8).add(3)) && mFast.isPrime(p.multiply(64).add(27)) && mFast.isPrime(p.multiply(512).add(219))) {
        return p;
      }
    }
  }
}
