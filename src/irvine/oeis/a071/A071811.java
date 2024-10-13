package irvine.oeis.a071;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A071811 a(n) = Sum_{k = 1..10^n} number of primes (counted with multiplicity) dividing k (A001222).
 * @author Sean A. Irvine
 */
public class A071811 extends Sequence0 {

  private long mLim = 1;
  private long mN = 1;
  private Z mSum = Z.ZERO;

  @Override
  public Z next() {
    while (mN <= mLim) {
      mSum = mSum.add(Functions.BIG_OMEGA.l(mN));
      ++mN;
    }
    mLim *= 10;
    return mSum;
  }
}
