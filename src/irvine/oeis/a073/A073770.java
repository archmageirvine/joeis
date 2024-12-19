package irvine.oeis.a073;

import irvine.math.z.Z;
import irvine.oeis.a000.A000040;

/**
 * A073770 Primes p not of the form q + s where q is prime and s &gt; 0 is the smallest square such that q + s is prime.
 * @author Sean A. Irvine
 */
public class A073770 extends A000040 {

  private boolean is(final Z p) {
    long k = 0;
    outer:
    while (true) {
      final Z q = p.subtract(++k * k);
      if (q.signum() <= 0) {
        return true;
      }
      if (mPrime.isPrime(q)) {
        // Check smallest
        for (long j = 1; j < k; ++j) {
          if (q.add(j * j).isProbablePrime()) {
            continue outer;
          }
        }
        return false;
      }
    }
  }

  @Override
  public Z next() {
    while (true) {
      final Z p = super.next();
      if (is(p)) {
        return p;
      }
    }
  }
}
