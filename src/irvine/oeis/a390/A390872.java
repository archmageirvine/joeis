package irvine.oeis.a390;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;
import irvine.util.array.LongDynamicLongArray;

/**
 * A390872 a(n) is the number of positive integers k such that tau(k) + phi(k) = n.
 * @author Sean A. Irvine
 */
public class A390872 extends Sequence1 {

  private final LongDynamicLongArray mCounts = new LongDynamicLongArray();
  private long mN = 0;
  private long mM = 0;

  @Override
  public Z next() {
    ++mN;
    final double log = Math.log(mN);
    final double lim = log * log * mN;
    while (mM < lim) {
      ++mM;
      mCounts.increment(Functions.PHI.l(mM) + Functions.SIGMA0.l(mM));
    }
    return Z.valueOf(mCounts.get(mN));
  }
}
