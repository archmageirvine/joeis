package irvine.oeis.a030;

import irvine.factor.prime.Fast;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A030296 Smallest start for a run of at least n composite numbers.
 * @author Sean A. Irvine
 */
public class A030296 extends Sequence1 {

  private final Fast mPrime = new Fast();
  private Z mP = Z.TWO;
  private Z mN = Z.ZERO;

  @Override
  public Z next() {
    mN = mN.add(1);
    while (true) {
      final Z a = mPrime.nextPrime(mP);
      final Z diff = a.subtract(mP);
      if (diff.compareTo(mN) > 0) {
        return mP.add(1);
      }
      mP = a;
    }
  }
}

