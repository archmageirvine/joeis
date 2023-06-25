package irvine.oeis.a064;

import irvine.math.z.Z;
import irvine.oeis.a000.A000040;

/**
 * A064269 Numbers k such that prime(k) - k is prime.
 * @author Sean A. Irvine
 */
public class A064269 extends A000040 {

  private long mN = 0;

  @Override
  public Z next() {
    while (true) {
      if (mPrime.isPrime(super.next().subtract(++mN))) {
        return Z.valueOf(mN);
      }
    }
  }
}
