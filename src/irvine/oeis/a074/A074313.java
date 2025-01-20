package irvine.oeis.a074;

import irvine.math.z.Z;
import irvine.oeis.a000.A000040;

/**
 * A074313 a(n) = the maximal length of a sequence of primes {s_1 = prime(n), s_2 = f(s1), s_3 = f(s_2), ....} formed by repeated application of f(m) = Floor(m/2) on prime(n).
 * @author Sean A. Irvine
 */
public class A074313 extends A000040 {

  @Override
  public Z next() {
    Z p = super.next();
    long cnt = 0;
    while (mPrime.isPrime(p)) {
      ++cnt;
      p = p.divide2();
    }
    return Z.valueOf(cnt);
  }
}
