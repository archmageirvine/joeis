package irvine.oeis.a002;

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.factor.prime.Fast;

/**
 * A002381.
 * @author Sean A. Irvine
 */
public class A002381 implements Sequence {

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
