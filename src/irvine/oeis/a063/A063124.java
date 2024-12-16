package irvine.oeis.a063;

import irvine.math.z.Z;
import irvine.oeis.a000.A000040;

/**
 * A063124 a(n) = # { primes p | prime(n) &lt;= p &lt; 2*prime(n) } where prime(n) is the n-th prime.
 * @author Sean A. Irvine
 */
public class A063124 extends A000040 {

  @Override
  public Z next() {
    Z p = super.next();
    final Z q = p.multiply2();
    long cnt = 0;
    while (p.compareTo(q) < 0) {
      ++cnt;
      p = mPrime.nextPrime(p);
    }
    return Z.valueOf(cnt);
  }
}
