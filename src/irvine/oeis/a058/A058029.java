package irvine.oeis.a058;

import irvine.math.z.Z;
import irvine.oeis.a051.A051451;

/**
 * A058029 Primes closest to LCM(1,...,x) either above or below. Arguments x were selected from A000961 (powers of primes including primes) in order to obtain distinct values of LCM exactly once.
 * @author Sean A. Irvine
 */
public class A058029 extends A051451 {

  {
    setOffset(0);
    super.next();
  }

  @Override
  public Z next() {
    final Z t = super.next();
    final Z lo = mPrime.prevPrime(t);
    final Z hi = mPrime.nextPrime(t);
    return t.subtract(lo).compareTo(hi.subtract(t)) <= 0 ? lo : hi;
  }
}
