package irvine.oeis.a064;

import irvine.math.z.Z;
import irvine.oeis.a000.A000040;

/**
 * A064152 Erdos primes: primes p such that all p-k! for 1&lt;=k!&lt;p are composite.
 * @author Sean A. Irvine
 */
public class A064152 extends A000040 {

  private boolean is(final long p) {
    long f = 1;
    long n = 1;
    while (f < p) {
      if (mPrime.isPrime(p - f)) {
        return false;
      }
      f *= ++n;
    }
    return true;
  }

  @Override
  public Z next() {
    while (true) {
      final Z p = super.next();
      if (is(p.longValueExact())) {
        return p;
      }
    }
  }
}
