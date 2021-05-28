package irvine.oeis.a047;

import irvine.math.z.Z;
import irvine.oeis.a000.A000040;

/**
 * A047948 Smallest of three consecutive primes with a difference of 6: primes p such that p+6 and p+12 are the next two primes.
 * @author Sean A. Irvine
 */
public class A047948 extends A000040 {

  @Override
  public Z next() {
    while (true) {
      final Z p = super.next();
      final Z q = mFast.nextPrime(p);
      if (q.equals(p.add(6)) && mFast.nextPrime(q).equals(p.add(12))) {
        return p;
      }
    }
  }
}
