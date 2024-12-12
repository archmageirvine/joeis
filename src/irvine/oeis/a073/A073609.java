package irvine.oeis.a073;

import irvine.factor.prime.Fast;
import irvine.math.predicate.Predicates;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A073565.
 * @author Sean A. Irvine
 */
public class A073609 extends Sequence0 {

  private final Fast mPrime = new Fast();
  private Z mA = null;

  @Override
  public Z next() {
    if (mA == null) {
      mA = Z.TWO;
      return Z.TWO;
    }
    final Z t = mA;
    while (true) {
      mA = mPrime.nextPrime(mA);
      if (Predicates.SQUARE.is(mA.subtract(t))) {
        return mA;
      }
    }
  }
}
