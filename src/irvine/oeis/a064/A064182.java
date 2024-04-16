package irvine.oeis.a064;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A064182 Sum_{k &lt;= 10^n} number of distinct primes dividing k (A001221).
 * @author Sean A. Irvine
 */
public class A064182 extends Sequence0 {

  private long mLim = 0;
  private long mN = 1;
  private Z mSum = Z.ZERO;

  @Override
  public Z next() {
    mLim = mLim == 0 ? 1 : mLim * 10;
    while (mN <= mLim) {
      mSum = mSum.add(Functions.OMEGA.i(mN++));
    }
    return mSum;
  }
}
