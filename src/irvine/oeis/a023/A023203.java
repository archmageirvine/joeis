package irvine.oeis.a023;

import irvine.math.z.Z;
import irvine.oeis.a000.A000040;

/**
 * A023203 Primes p such that p <code>+ 10</code> is also prime.
 * @author Sean A. Irvine
 */
public class A023203 extends A000040 {

  @Override
  public Z next() {
    while (true) {
      final Z p = super.next();
      if (mFast.isPrime(p.add(10))) {
        return p;
      }
    }
  }
}
