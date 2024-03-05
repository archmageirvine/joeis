package irvine.oeis.a068;

import irvine.factor.prime.Fast;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A068695 Smallest number (not beginning with 0) that yields a prime when placed on the right of n.
 * @author Sean A. Irvine
 */
public class A068695 extends Sequence1 {

  private final Fast mPrime = new Fast();
  private long mN = 0;

  @Override
  public Z next() {
    ++mN;
    long k = -1;
    long lim = 10;
    while (true) {
      k += 2;
      if (k > lim) {
        lim *= 10;
      }
      if (mPrime.isPrime(mN * lim + k)) {
        return Z.valueOf(k);
      }
    }
  }
}
