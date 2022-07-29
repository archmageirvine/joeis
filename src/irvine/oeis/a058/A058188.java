package irvine.oeis.a058;

import irvine.math.z.Z;
import irvine.oeis.a000.A000040;

/**
 * A058188 Number of primes between prime(n) and prime(n) + sqrt(prime(n)), where prime(n) is the n-th prime.
 * @author Sean A. Irvine
 */
public class A058188 extends A000040 {

  @Override
  public Z next() {
    final Z p = super.next();
    final Z q = p.add(p.sqrt());
    long cnt = 0;
    Z r = mPrime.nextPrime(p);
    while (r.compareTo(q) <= 0) {
      ++cnt;
      r = mPrime.nextPrime(r);
    }
    return Z.valueOf(cnt);
  }
}
