package irvine.oeis.a053;

import irvine.factor.prime.Fast;
import irvine.math.z.Euler;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A053162 Nonprimes n such that n+cototient(n) is a power of 2.
 * @author Sean A. Irvine
 */
public class A053162 extends Sequence1 {

  private final Fast mPrime = new Fast();
  private long mN = 0;

  @Override
  public Z next() {
    while (true) {
      if (!mPrime.isPrime(++mN)) {
        final long t = 2 * mN - Euler.phiAsLong(mN);
        if ((t & (t - 1)) == 0) {
          return Z.valueOf(mN);
        }
      }
    }
  }
}
