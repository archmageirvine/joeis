package irvine.oeis.a340;

import irvine.factor.prime.Fast;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A340959 Table read by antidiagonals of the smallest prime &gt;= n^k, n &gt;= 1 and k &gt;= 0.
 * @author Sean A. Irvine
 */
public class A340959 extends Sequence1 {

  private final Fast mPrime = new Fast();
  private int mN = 0;
  private int mM = 0;

  @Override
  public Z next() {
    if (++mM >= mN) {
      ++mN;
      mM = 0;
    }
    return mPrime.nextPrime(Z.valueOf(mN - mM).pow(mM).subtract(1));
  }
}
