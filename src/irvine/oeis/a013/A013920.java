package irvine.oeis.a013;

import irvine.factor.prime.Fast;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A013920 Composite numbers k such that the sum of all composites &lt;= k is composite.
 * @author Sean A. Irvine
 */
public class A013920 extends Sequence1 {

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
