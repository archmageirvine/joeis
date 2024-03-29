package irvine.oeis.a023;

import irvine.math.z.Z;
import irvine.oeis.a000.A000040;

/**
 * A023280 Primes that remain prime through 3 iterations of function f(x) = 3x + 10.
 * @author Sean A. Irvine
 */
public class A023280 extends A000040 {

  @Override
  public Z next() {
    while (true) {
      final Z p = super.next();
      if (mPrime.isPrime(p.multiply(3).add(10)) && mPrime.isPrime(p.multiply(9).add(40)) && mPrime.isPrime(p.multiply(27).add(130))) {
        return p;
      }
    }
  }
}
