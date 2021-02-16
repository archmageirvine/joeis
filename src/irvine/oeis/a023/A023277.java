package irvine.oeis.a023;

import irvine.math.z.Z;
import irvine.oeis.a000.A000040;

/**
 * A023277 Primes that remain prime through 3 iterations of function f(x) = 3x + 2.
 * @author Sean A. Irvine
 */
public class A023277 extends A000040 {

  @Override
  public Z next() {
    while (true) {
      final Z p = super.next();
      if (mFast.isPrime(p.multiply(3).add(2)) && mFast.isPrime(p.multiply(9).add(8)) && mFast.isPrime(p.multiply(27).add(26))) {
        return p;
      }
    }
  }
}
