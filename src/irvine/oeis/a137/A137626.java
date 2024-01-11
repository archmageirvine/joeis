package irvine.oeis.a137;

import irvine.factor.factor.Jaguar;
import irvine.factor.prime.Fast;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A137626 The largest prime in the first set of n consecutive primes for which p+4 is semiprime.
 * @author Sean A. Irvine
 */
public class A137626 extends Sequence1 {

  private final Fast mPrime = new Fast();
  private Z mP = Z.ONE;
  private int mChainLength = 0;
  private int mN = 0;

  @Override
  public Z next() {
    ++mN;
    while (true) {
      mP = mPrime.nextPrime(mP);
      if (Jaguar.factor(mP.add(4)).isSemiprime()) {
        if (++mChainLength == mN) {
          return mP;
        }
      } else {
        mChainLength = 0;
      }
    }
  }

}

