package irvine.oeis.a027;

import irvine.factor.prime.Fast;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A027700 Numbers k such that the k-th prime has an even number of 1's in its binary expansion.
 * @author Sean A. Irvine
 */
public class A027700 implements Sequence {

  private final Fast mPrime = new Fast();
  private Z mP = Z.TWO;
  private long mN = 1;

  @Override
  public Z next() {
    while (true) {
      ++mN;
      mP = mPrime.nextPrime(mP);
      if ((mP.bitCount() & 1) == 0) {
        return Z.valueOf(mN);
      }
    }
  }
}
