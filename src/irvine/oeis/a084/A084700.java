package irvine.oeis.a084;

import irvine.factor.prime.Fast;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A084700 Smallest k such that k*prime(i)+1 is prime for i = 1 to n.
 * @author Sean A. Irvine
 */
public class A084700 extends Sequence1 {

  private final Fast mPrime = new Fast();
  private long mP = 1;
  private Z mM = Z.ZERO;

  private boolean is(final Z n) {
    for (long p = mP; p > 1; p = mPrime.prevPrime(p)) {
      if (!n.multiply(p).add(1).isProbablePrime()) {
        return false;
      }
    }
    return true;
  }

  @Override
  public Z next() {
    mP = mPrime.nextPrime(mP);
    while (!is(mM)) {
      mM = mM.add(1);
    }
    return mM;
  }
}
