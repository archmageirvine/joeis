package irvine.oeis.a138;

import irvine.math.z.Z;
import irvine.oeis.a278.A278932;

/**
 * A138025 Primes that remain prime through 7 iterations of function f(x) = 2x + 1.
 * @author Georg Fischer
 */
public class A138025 extends A278932 {

  @Override
  public Z next() {
    while (true) {
      final Z p = super.next();
      if (mPrime.isPrime(p.multiply(128).add(127))) {
        return p;
      }
    }
  }
}
