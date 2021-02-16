package irvine.oeis.a023;

import irvine.math.z.Z;
import irvine.oeis.a000.A000040;

/**
 * A023231 Primes p such that 8*p + 7 is also prime.
 * @author Sean A. Irvine
 */
public class A023231 extends A000040 {

  @Override
  public Z next() {
    while (true) {
      final Z p = super.next();
      if (mFast.isPrime(p.multiply(8).add(7))) {
        return p;
      }
    }
  }
}
