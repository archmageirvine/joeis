package irvine.oeis.a002;

import irvine.factor.prime.Fast;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A002314 Minimal integer square root of -1 modulo p, where p is the n-th prime of the form 4k+1.
 * @author Sean A. Irvine
 */
public class A002314 extends Sequence1 {

  private final Fast mPrime = new Fast();
  private Z mP = Z.THREE;

  @Override
  public Z next() {
    while (true) {
      mP = mPrime.nextPrime(mP);
      if (mP.mod(4) == 1) {
        Z k = Z.ZERO;
        while (true) {
          k = k.add(1);
          if (k.square().add(1).mod(mP).isZero()) {
            return k;
          }
        }
      }
    }
  }
}
