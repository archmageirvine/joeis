package irvine.oeis.a067;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;
import irvine.oeis.prime.HomePrimeSequence;

/**
 * A067254 Numbers k such that the decimal encoding of the prime factorization of k (A067599) ends in k.
 * @author Sean A. Irvine
 */
public class A067254 extends Sequence1 {

  private long mN = 10;
  private long mLim = 100;

  @Override
  public Z next() {
    while (true) {
      if (++mN == mLim) {
        mLim *= 10;
      }
      if (new HomePrimeSequence(mN, 10, false, HomePrimeSequence.HomePrimeType.ALONSO_WITH_ONE).skip().next().mod(mLim) == mN) {
        return Z.valueOf(mN);
      }
    }
  }
}

