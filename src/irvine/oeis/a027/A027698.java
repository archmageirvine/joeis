package irvine.oeis.a027;

import irvine.factor.prime.Fast;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A027698 Numbers k such that the k-th prime has an odd number of 1's in its binary expansion.
 * @author Sean A. Irvine
 */
public class A027698 implements Sequence {

  private final Fast mPrime = new Fast();
  private Z mP = Z.ONE;
  private long mN = 0;

  @Override
  public Z next() {
    while (true) {
      ++mN;
      mP = mPrime.nextPrime(mP);
      if ((mP.bitCount() & 1) == 1) {
        return Z.valueOf(mN);
      }
    }
  }
}
