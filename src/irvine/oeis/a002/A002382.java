package irvine.oeis.a002;

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.factor.prime.Fast;

/**
 * A002382.
 * @author Sean A. Irvine
 */
public class A002382 implements Sequence {

  private final Fast mPrime = new Fast();
  private Z mP = Z.ONE;

  @Override
  public Z next() {
    while (true) {
      mP = mPrime.nextPrime(mP);
      final Z t = mP.square().subtract(49);
      if (t.mod(120) == 0) {
        return t.divide(120);
      }
    }
  }
}
