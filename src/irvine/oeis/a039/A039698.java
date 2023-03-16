package irvine.oeis.a039;

import irvine.factor.prime.Fast;
import irvine.math.z.Euler;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A039698 Numbers k such that phi(k) + 1 is prime.
 * @author Sean A. Irvine
 */
public class A039698 extends Sequence1 {

  private final Fast mPrime = new Fast();
  private long mN = 0;

  @Override
  public Z next() {
    while (true) {
      long n = ++mN;
      if (mPrime.isPrime(Euler.phiAsLong(n) + 1)) {
        return Z.valueOf(mN);
      }
    }
  }
}
