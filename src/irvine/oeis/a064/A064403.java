package irvine.oeis.a064;

import irvine.math.z.Z;
import irvine.oeis.a000.A000040;

/**
 * A064403 Numbers k such that prime(k) + k and prime(k) - k are both primes.
 * @author Sean A. Irvine
 */
public class A064403 extends A000040 {

  private long mN = 0;

  @Override
  public Z next() {
    while (true) {
      final Z p = super.next();
      if (mPrime.isPrime(p.subtract(++mN)) && mPrime.isPrime(p.add(mN))) {
        return Z.valueOf(mN);
      }
    }
  }
}

