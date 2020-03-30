package irvine.oeis.a030;

import irvine.factor.prime.Fast;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A030296.
 * @author Sean A. Irvine
 */
public class A030296 implements Sequence {

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

