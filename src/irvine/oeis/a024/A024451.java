package irvine.oeis.a024;

import irvine.factor.prime.Fast;
import irvine.math.q.Q;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A024451 a(n) is the numerator of Sum_{i = 1..n} 1/prime(i).
 * @author Sean A. Irvine
 */
public class A024451 extends Sequence0 {

  private final Fast mPrime = new Fast();
  private Q mSum = null;
  private long mP = 1;

  @Override
  public Z next() {
    if (mSum == null) {
      mSum = Q.ZERO;
    } else {
      mP = mPrime.nextPrime(mP);
      mSum = mSum.add(new Q(1, mP));
    }
    return mSum.num();
  }
}
