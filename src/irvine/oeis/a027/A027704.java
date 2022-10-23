package irvine.oeis.a027;

import irvine.factor.prime.Fast;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A027704 Numbers k such that the k-th prime has an even number of 1's in its binary expansion and the (k+1)st prime has an odd number of 1's.
 * @author Sean A. Irvine
 */
public class A027704 extends Sequence1 {

  private final Fast mPrime = new Fast();
  private Z mP = Z.TWO;
  private long mN = 1;

  @Override
  public Z next() {
    while (true) {
      ++mN;
      mP = mPrime.nextPrime(mP);
      if ((mP.bitCount() & 1) == 0 && (mPrime.nextPrime(mP).bitCount() & 1) == 1) {
        return Z.valueOf(mN);
      }
    }
  }
}
