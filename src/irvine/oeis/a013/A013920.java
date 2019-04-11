package irvine.oeis.a013;

import irvine.factor.prime.Fast;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A013920 n is composite and sum of all composites <code>&lt;= n</code> is composite.
 * @author Sean A. Irvine
 */
public class A013920 implements Sequence {

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
        return mM;
      }
    }
  }
}
