package irvine.oeis.a064;

import irvine.math.z.Z;
import irvine.oeis.a000.A000040;

/**
 * A064712 Numbers k such that k^2 - prime(k) is a prime.
 * @author Sean A. Irvine
 */
public class A064712 extends A000040 {

  private long mN = 0;

  @Override
  public Z next() {
    while (true) {
      final Z s = Z.valueOf(++mN * mN);
      final Z p = super.next();
      if (mPrime.isPrime(s.subtract(p))) {
        return Z.valueOf(mN);
      }
    }
  }
}
