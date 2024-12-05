package irvine.oeis.a123;

import irvine.math.z.Z;
import irvine.oeis.a000.A000040;

/**
 * A123993 Primes p such that p^2 is an interprime = average of two successive primes.
 * @author Sean A. Irvine
 */
public class A123993 extends A000040 {

  @Override
  public Z next() {
    while (true) {
      final Z p = super.next();
      final Z p2 = p.square();
      final Z q = mPrime.prevPrime(p2);
      final Z r = mPrime.nextPrime(q);
      if (q.add(r).equals(p2.multiply2())) {
        return p;
      }
    }
  }
}
