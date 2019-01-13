package irvine.oeis.a033;

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.factor.prime.Fast;

/**
 * A033203.
 * @author Sean A. Irvine
 */
public class A033203 implements Sequence {

  private final Fast mPrime = new Fast();
  private Z mP = Z.ONE;

  @Override
  public Z next() {
    while (true) {
      mP = mPrime.nextPrime(mP);
      final long r = mP.mod(8);
      if (r == 1 || r == 2 || r == 3) {
        return mP;
      }
    }
  }
}

