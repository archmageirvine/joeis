package irvine.oeis.a052;

import irvine.math.z.Z;
import irvine.oeis.a000.A000040;

/**
 * A052189 Primes p such that p, p+18, p+36 are consecutive primes.
 * @author Sean A. Irvine
 */
public class A052189 extends A000040 {

  @Override
  public Z next() {
    while (true) {
      final Z p = super.next();
      final Z q = mPrime.nextPrime(p);
      if (q.equals(p.add(18)) && mPrime.nextPrime(q).equals(p.add(36))) {
        return p;
      }
    }
  }
}
