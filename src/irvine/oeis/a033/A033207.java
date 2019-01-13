package irvine.oeis.a033;

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.factor.prime.Fast;

/**
 * A033207.
 * @author Sean A. Irvine
 */
public class A033207 implements Sequence {

  private final Fast mPrime = new Fast();
  private Z mP = Z.FIVE;

  @Override
  public Z next() {
    while (true) {
      mP = mPrime.nextPrime(mP);
      final long r = mP.mod(28);
      if (r == 1 || r == 7 || r == 9 || r == 11 || r == 15 || r == 23 || r == 25) {
        return mP;
      }
    }
  }
}

