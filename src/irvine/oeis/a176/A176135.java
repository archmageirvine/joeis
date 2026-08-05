package irvine.oeis.a176;

import irvine.math.z.Z;
import irvine.oeis.a000.A000040;

/**
 * A176135 Primes p in the sequence prime(k+1)^3-prime(k)^3-1.
 * @author Sean A. Irvine
 */
public class A176135 extends A000040 {

  @Override
  public Z next() {
    while (true) {
      final Z p = super.next();
      final Z q = mPrime.nextPrime(p);
      final Z t = q.pow(3).subtract(p.pow(3)).subtract(1);
      if (t.isProbablePrime()) {
        return t;
      }
    }
  }
}
