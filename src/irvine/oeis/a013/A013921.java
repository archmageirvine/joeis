package irvine.oeis.a013;

import irvine.factor.prime.Fast;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A013921 a(n) is composite and is sum of first k composites for some k.
 * @author Sean A. Irvine
 */
public class A013921 implements Sequence {

  private final Fast mPrime = new Fast();
  private Z mSum = Z.ZERO;
  private Z mM = Z.THREE;

  @Override
  public Z next() {
    while (true) {
      mM = mM.add(1);
      if (mPrime.isPrime(mM)) {
        continue;
      }
      mSum = mSum.add(mM);
      if (!mPrime.isPrime(mSum)) {
        return mSum;
      }
    }
  }
}
