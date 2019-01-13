package irvine.oeis.a001;

import irvine.factor.prime.Fast;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A001132.
 * @author Sean A. Irvine
 */
public class A001132 implements Sequence {

  private final Fast mPrime = new Fast();
  private Z mP = Z.FIVE;

  @Override
  public Z next() {
    while (true) {
      mP = mPrime.nextPrime(mP);
      final long r = mP.mod(8);
      if (r == 1 || r == 7) {
        return mP;
      }
    }
  }
}

