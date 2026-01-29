package irvine.oeis.a392;

import irvine.factor.prime.Fast;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A392412 allocated for Paul Duckett.
 * @author Sean A. Irvine
 */
public class A392412 extends Sequence1 {

  private final Fast mPrime = new Fast();
  private long mP = 1;

  @Override
  public Z next() {
    mP = mPrime.nextPrime(mP);
    if (Z.TWO.equals(mP)) {
      return Z.EIGHT;
    }
    Z sum = Z.ZERO;
    Z q = Z.valueOf(mPrime.nextPrime(mP));
    long p = mP;
    while (p > 1) {
      sum = sum.add(q.pow(p));
      q = mPrime.nextPrime(q);
      p = mPrime.prevPrime(p);
    }
    return sum;
  }
}
