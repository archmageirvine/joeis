package irvine.oeis.a002;

import irvine.factor.prime.Fast;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A002381 Numbers of the form (p^2 - 1)/120 where p is 1 or prime.
 * @author Sean A. Irvine
 */
public class A002381 extends Sequence1 {

  private final Fast mPrime = new Fast();
  private Z mP = null;

  @Override
  public Z next() {
    if (mP == null) {
      mP = Z.ONE;
      return Z.ZERO;
    }
    while (true) {
      mP = mPrime.nextPrime(mP);
      final Z t = mP.square().subtract(1);
      if (t.mod(120) == 0) {
        return t.divide(120);
      }
    }
  }
}
