package irvine.oeis.a079;

import irvine.math.z.Z;
import irvine.oeis.a000.A000040;

/**
 * A079047 Number of primes between prime(n) and prime(n)^2.
 * @author Sean A. Irvine
 */
public class A079047 extends A000040 {

  @Override
  public Z next() {
    final Z p = super.next();
    final Z p2 = p.square();
    long cnt = 0;
    Z q = p;
    while ((q = mPrime.nextPrime(q)).compareTo(p2) < 0) {
      ++cnt;
    }
    return Z.valueOf(cnt);
  }
}
