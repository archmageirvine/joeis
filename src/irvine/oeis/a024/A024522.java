package irvine.oeis.a024;

import irvine.factor.prime.Fast;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A024522.
 * @author Sean A. Irvine
 */
public class A024522 implements Sequence {

  private final Fast mPrime = new Fast();
  private Z mSum = Z.ZERO;
  private long mR = 1;

  @Override
  public Z next() {
    mR = mPrime.nextPrime(mR);
    final Z r = Z.valueOf(mR);
    for (long p = 1; p < mR; p = mPrime.nextPrime(p)) {
      mSum = mSum.add(r.multiply(p));
    }
    return mSum;
  }
}
