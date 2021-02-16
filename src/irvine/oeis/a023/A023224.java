package irvine.oeis.a023;

import irvine.math.z.Z;
import irvine.oeis.a000.A000040;

/**
 * A023224 Primes p such that 7*p + 4 is also prime.
 * @author Sean A. Irvine
 */
public class A023224 extends A000040 {

  @Override
  public Z next() {
    while (true) {
      final Z p = super.next();
      if (mFast.isPrime(p.multiply(7).add(4))) {
        return p;
      }
    }
  }
}
