package irvine.oeis.a023;

import irvine.math.z.Z;
import irvine.oeis.a000.A000040;

/**
 * A023260 Primes that remain prime through 2 iterations of function f(x) = 8x + 1.
 * @author Sean A. Irvine
 */
public class A023260 extends A000040 {

  @Override
  public Z next() {
    while (true) {
      final Z p = super.next();
      if (mPrime.isPrime(p.multiply(8).add(1)) && mPrime.isPrime(p.multiply(64).add(9))) {
        return p;
      }
    }
  }
}
