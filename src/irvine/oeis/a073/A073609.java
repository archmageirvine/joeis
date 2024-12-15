package irvine.oeis.a073;

import irvine.factor.prime.Fast;
import irvine.math.predicate.Predicates;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A073609 a(0) = 2; a(n) for n &gt; 0 is the smallest prime greater than a(n-1) that differs from a(n-1) by a square.
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
