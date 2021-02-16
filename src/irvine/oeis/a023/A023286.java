package irvine.oeis.a023;

import irvine.math.z.Z;
import irvine.oeis.a000.A000040;

/**
 * A023286 Primes that remain prime through 3 iterations of function f(x) = 5x + 8.
 * @author Sean A. Irvine
 */
public class A023286 extends A000040 {

  @Override
  public Z next() {
    while (true) {
      final Z p = super.next();
      if (mFast.isPrime(p.multiply(5).add(8)) && mFast.isPrime(p.multiply(25).add(48)) && mFast.isPrime(p.multiply(125).add(248))) {
        return p;
      }
    }
  }
}
