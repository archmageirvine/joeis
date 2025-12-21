package irvine.oeis.a391;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;
import irvine.util.array.LongDynamicIntArray;

/**
 * A391374 Number of positive integers k such that k's arithmetic mean of divisors is at most n.
 * @author Sean A. Irvine
 */
public class A391374 extends Sequence1 {

  private final LongDynamicIntArray mCounts = new LongDynamicIntArray();
  private long mN = 0;
  private long mM = 1;
  private Z mSum = Z.ZERO;

  @Override
  public Z next() {
    ++mN;
    while (mM <= 4 * mN * mN) {
      final Z s1 = Functions.SIGMA1.z(mM);
      final long s0 = Functions.SIGMA0.l(mM);
      mCounts.increment(s1.add(s0 - 1).divide(s0).longValueExact());
      ++mM;
    }
    mSum = mSum.add(mCounts.get(mN));
    return mSum;
  }
}
