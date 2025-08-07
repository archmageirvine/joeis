package irvine.oeis.a079;

import irvine.factor.prime.Fast;
import irvine.math.function.Functions;
import irvine.math.q.HarmonicSequence;
import irvine.math.q.Q;
import irvine.math.z.Z;
import irvine.oeis.Sequence3;

/**
 * A079303 a(n) = ((p-1)!/(2*p^2)) * Sum_{j=1..p-1} 1/j where p is the n-th prime.
 * @author Sean A. Irvine
 */
public class A079303 extends Sequence3 {

  private final Fast mPrime = new Fast();
  private long mP = 3;
  private final HarmonicSequence mHarmonic = new HarmonicSequence();
  private long mN = 0;
  private Q mH;

  @Override
  public Z next() {
    mP = mPrime.nextPrime(mP);
    while (mN < mP - 1) {
      mH = mHarmonic.nextQ();
      ++mN;
    }
    return mH.multiply(Functions.FACTORIAL.z(mP - 1)).divide(2 * mP * mP).toZ();
  }
}
