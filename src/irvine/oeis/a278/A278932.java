package irvine.oeis.a278;

import irvine.math.z.Z;
import irvine.oeis.a023.A023330;

/**
 * A023330 Primes that remain prime through 5 iterations of function f(x) = 2x + 1.
 * @author Sean A. Irvine
 */
public class A278932 extends A023330 {

  @Override
  public Z next() {
    while (true) {
      final Z p = super.next();
      if (mPrime.isPrime(p.multiply(64).add(63))) {
        return p;
      }
    }
  }
}
