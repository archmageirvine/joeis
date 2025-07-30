package irvine.oeis.a079;

import irvine.factor.prime.Fast;
import irvine.math.predicate.Predicates;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A079062 a(1) = 2; for n&gt;1, a(n) = smallest prime p such that p - a(n-1) = a^b for some positive integers a,b &gt; 1.
 * @author Sean A. Irvine
 */
public class A079062 extends Sequence1 {

  private final Fast mPrime = new Fast();
  private Z mA = null;

  @Override
  public Z next() {
    if (mA == null) {
      mA = Z.TWO;
      return mA;
    }
    Z p = mA;
    while (true) {
      p = mPrime.nextPrime(p);
      if (Predicates.POWER.is(p.subtract(mA))) {
        mA = p;
        return mA;
      }
    }
  }
}

