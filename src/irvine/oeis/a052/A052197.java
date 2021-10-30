package irvine.oeis.a052;

import irvine.math.z.Z;
import irvine.oeis.a000.A000040;

/**
 * A052197 Primes p such that p, p+36, p+72 are consecutive primes.
 * @author Sean A. Irvine
 */
public class A052197 extends A000040 {

  @Override
  public Z next() {
    while (true) {
      final Z p = super.next();
      final Z q = mPrime.nextPrime(p);
      if (q.equals(p.add(36)) && mPrime.nextPrime(q).equals(p.add(72))) {
        return p;
      }
    }
  }
}
