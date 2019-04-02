package irvine.oeis.a013;

import irvine.factor.prime.Fast;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A013919 Numbers n such that sum of first n composites is composite.
 * @author Sean A. Irvine
 */
public class A013919 implements Sequence {

  private final Fast mPrime = new Fast();
  private Z mSum = Z.ZERO;
  private Z mM = Z.THREE;
  private long mN = 0;

  @Override
  public Z next() {
    while (true) {
      mM = mM.add(1);
      if (mPrime.isPrime(mM)) {
        continue;
      }
      ++mN;
      mSum = mSum.add(mM);
      if (!mPrime.isPrime(mSum)) {
        return Z.valueOf(mN);
      }
    }
  }
}
