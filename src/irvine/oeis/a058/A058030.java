package irvine.oeis.a058;

import irvine.math.z.Z;
import irvine.oeis.a051.A051451;

/**
 * A058030 Signed distance of primes from LCM(1,...,x) being closest to it. Arguments x were selected from A000961 (powers of primes including primes) in order to use distinct values of LCM exactly once. When both closest primes are in the same distance, then negative were used.
 * @author Sean A. Irvine
 */
public class A058030 extends A051451 {

  {
    super.next();
  }

  @Override
  public Z next() {
    final Z t = super.next();
    final Z lo = mPrime.prevPrime(t);
    final Z hi = mPrime.nextPrime(t);
    final Z lot = t.subtract(lo);
    final Z hit = hi.subtract(t);
    return lot.compareTo(hit) <= 0 ? lot.negate() : hit;
  }
}
