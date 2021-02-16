package irvine.oeis.a023;

import irvine.math.z.Z;
import irvine.oeis.a000.A000040;

/**
 * A023241 Primes that remain prime through 2 iterations of function f(x) = x + 6.
 * @author Sean A. Irvine
 */
public class A023241 extends A000040 {

  @Override
  public Z next() {
    while (true) {
      final Z p = super.next();
      if (mFast.isPrime(p.add(6)) && mFast.isPrime(p.add(12))) {
        return p;
      }
    }
  }
}
