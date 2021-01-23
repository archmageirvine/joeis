package irvine.oeis.a037;

import irvine.factor.prime.Fast;
import irvine.factor.prime.Prime;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A037040 Number of odd nonprimes &lt; (2n+1)^2.
 * @author Sean A. Irvine
 */
public class A037040 implements Sequence {

  private Prime mPrime = new Fast();
  private long mM = -1;
  private long mN = -1;
  private long mCount = 0;

  @Override
  public Z next() {
    mN += 2;
    final long s = mN * mN;
    while (mM + 2 < s) {
      mM += 2;
      if (!mPrime.isPrime(mM)) {
        ++mCount;
      }
    }
    return Z.valueOf(mCount);
  }
}
