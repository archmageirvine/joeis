package irvine.oeis.a393;

import irvine.factor.prime.Fast;
import irvine.math.predicate.Predicates;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A393798 allocated for Lei Zhou.
 * @author Sean A. Irvine
 */
public class A393798 extends Sequence1 {

  private final Fast mPrime = new Fast();
  private Z mA = null;

  @Override
  public Z next() {
    if (mA == null) {
      mA = Z.TWO;
      return Z.TWO;
    }
    final Z p = mA;
    while (true) {
      mA = mPrime.nextPrime(mA);
      if (Predicates.SMOOTH.is(3, mA.subtract(p))) {
        return mA;
      }
    }
  }
}
