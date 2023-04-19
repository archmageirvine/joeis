package irvine.oeis.a070;

import irvine.math.z.Z;
import irvine.oeis.a000.A000040;

/**
 * A070046 Number of primes between prime(n) and 2*prime(n) exclusive.
 * @author Sean A. Irvine
 */
public class A070046 extends A000040 {

  @Override
  public Z next() {
    Z p = super.next();
    final Z q = p.multiply2();
    long cnt = -1;
    while (p.compareTo(q) < 0) {
      ++cnt;
      p = mPrime.nextPrime(p);
    }
    return Z.valueOf(cnt);
  }
}
