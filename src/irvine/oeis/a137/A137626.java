package irvine.oeis.a137;

import irvine.factor.factor.Cheetah;
import irvine.factor.prime.Fast;
import irvine.factor.util.FactorSequence;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A137626.
 * @author Sean A. Irvine
 */
public class A137626 implements Sequence {

  private final Fast mPrime = new Fast();
  private Z mP = Z.ONE;
  private int mChainLength = 0;
  private int mN = 0;

  @Override
  public Z next() {
    ++mN;
    while (true) {
      mP = mPrime.nextPrime(mP);
      final int s = Cheetah.factor(mP.add(4)).isSemiprime();
      if (s == FactorSequence.UNKNOWN) {
        throw new UnsupportedOperationException();
      }
      if (s == FactorSequence.YES) {
        if (++mChainLength == mN) {
          return mP;
        }
      } else {
        mChainLength = 0;
      }
    }
  }

}

