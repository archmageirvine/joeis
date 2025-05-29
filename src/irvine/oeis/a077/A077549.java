package irvine.oeis.a077;

import irvine.factor.prime.Fast;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A077549 Rearrangement of primes so that the most significant decimal digit follows the cyclic pattern 1,2,3,4,5,6,7,8,9,1,2,3,4,5,6,7,8,9...
 * @author Sean A. Irvine
 */
public class A077549 extends Sequence1 {

  private final Fast mPrime = new Fast();
  private final long[] mP = new long[10]; // element 0 not used
  private int mN = 0;

  @Override
  public Z next() {
    if (++mN == mP.length) {
      mN = 1;
    }
    while (true) {
      mP[mN] = mPrime.nextPrime(mP[mN]);
      if (String.valueOf(mP[mN]).charAt(0) == (char) ('0' + mN)) {
        return Z.valueOf(mP[mN]);
      }
    }
  }
}
