package irvine.oeis.a003;

import irvine.factor.prime.Fast;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A003625.
 * @author Sean A. Irvine
 */
public class A003625 implements Sequence {

  private Z mP = Z.TWO;
  private final Fast mPrime = new Fast();

  @Override
  public Z next() {
    while (true) {
      mP = mPrime.nextPrime(mP);
      final long r = mP.mod(7);
      if (r == 3 || r == 5 || r == 6) {
        return mP;
      }
    }
  }
}
