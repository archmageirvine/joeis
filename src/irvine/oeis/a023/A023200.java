package irvine.oeis.a023;

import irvine.math.z.Z;
import irvine.oeis.a000.A000040;

/**
 * A023200 Primes p such that p + 4 is also prime.
 * @author Sean A. Irvine
 */
public class A023200 extends A000040 {

  @Override
  public Z next() {
    while (true) {
      final Z p = super.next();
      if (mFast.isPrime(p.add(4))) {
        return p;
      }
    }
  }
}
