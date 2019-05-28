package irvine.oeis.a023;

import irvine.math.z.Z;
import irvine.oeis.a000.A000040;

/**
 * A023201 Sexy primes: numbers n such that n and <code>n + 6</code> are both prime.
 * @author Sean A. Irvine
 */
public class A023201 extends A000040 {

  @Override
  public Z next() {
    while (true) {
      final Z p = super.next();
      if (mFast.isPrime(p.add(6))) {
        return p;
      }
    }
  }
}
