package irvine.oeis.a052;

import irvine.math.z.Z;
import irvine.oeis.a000.A000040;

/**
 * A052198 Primes p such that p, p+42, p+84 are consecutive primes.
 * @author Sean A. Irvine
 */
public class A052198 extends A000040 {

  @Override
  public Z next() {
    while (true) {
      final Z p = super.next();
      final Z q = mPrime.nextPrime(p);
      if (q.equals(p.add(42)) && mPrime.nextPrime(q).equals(p.add(84))) {
        return p;
      }
    }
  }
}
