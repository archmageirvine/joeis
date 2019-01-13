package irvine.oeis.a003;

import irvine.factor.prime.Fast;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A003628.
 * @author Sean A. Irvine
 */
public class A003628 implements Sequence {

  private Z mP = Z.THREE;
  private final Fast mPrime = new Fast();

  @Override
  public Z next() {
    while (true) {
      mP = mPrime.nextPrime(mP);
      final long r = mP.mod(8);
      if (r == 5 || r == 7) {
        return mP;
      }
    }
  }
}
