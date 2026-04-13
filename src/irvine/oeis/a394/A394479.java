package irvine.oeis.a394;

import irvine.math.cr.CR;
import irvine.math.function.Functions;
import irvine.math.q.Q;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;
import irvine.util.array.LongDynamicLongArray;

/**
 * A394479 allocated for Tsuyoshi Hanatate.
 * @author Sean A. Irvine
 */
public class A394479 extends Sequence1 {

  private LongDynamicLongArray mCounts = null;
  private long mN = 0;
  private long mLimit = 0;
  private long mM = 0;

  @Override
  public Z next() {
    if (++mM >= mLimit) {
      ++mN;
      mM = 0;
      mLimit = CR.LOG2.multiply(mN).divide(CR.valueOf(new Q(3, 2)).log()).floor().longValueExact() + 1;
      mCounts = new LongDynamicLongArray();
      final long end = Z.THREE.pow(mLimit - 1).longValueExact();
      for (long u = 1; u <= end; u += 2) {
        final long omega = Functions.BIG_OMEGA.l(u);
        if (u < 1L << (mN + omega)) {
          mCounts.increment(omega);
        }
      }
    }
    return Z.valueOf(mCounts.get(mM));
  }
}
