package irvine.oeis.a052;

import irvine.math.z.Z;
import irvine.oeis.a000.A000040;

/**
 * A052195 Primes p such that p, p+30, p+60 are consecutive primes.
 * @author Sean A. Irvine
 */
public class A052195 extends A000040 {

  @Override
  public Z next() {
    while (true) {
      final Z p = super.next();
      final Z q = mPrime.nextPrime(p);
      if (q.equals(p.add(30)) && mPrime.nextPrime(q).equals(p.add(60))) {
        return p;
      }
    }
  }
}
