package irvine.oeis.a023;

import irvine.math.z.Z;
import irvine.oeis.a000.A000040;

/**
 * A023274 Primes that remain prime through 3 iterations of function f(x) = 2x + 5.
 * @author Sean A. Irvine
 */
public class A023274 extends A000040 {

  @Override
  public Z next() {
    while (true) {
      final Z p = super.next();
      if (mFast.isPrime(p.multiply2().add(5)) && mFast.isPrime(p.multiply(4).add(15)) && mFast.isPrime(p.multiply(8).add(35))) {
        return p;
      }
    }
  }
}
