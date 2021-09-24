package irvine.oeis.a023;

import irvine.math.z.Z;
import irvine.oeis.a000.A000040;

/**
 * A023259 Primes that remain prime through 2 iterations of function f(x) = 7x + 6.
 * @author Sean A. Irvine
 */
public class A023259 extends A000040 {

  @Override
  public Z next() {
    while (true) {
      final Z p = super.next();
      if (mPrime.isPrime(p.multiply(7).add(6)) && mPrime.isPrime(p.multiply(49).add(48))) {
        return p;
      }
    }
  }
}
