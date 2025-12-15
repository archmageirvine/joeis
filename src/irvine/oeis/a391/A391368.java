package irvine.oeis.a391;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;
import irvine.util.array.LongDynamicIntArray;

/**
 * A391368 allocated for Joe Anderson.
 * @author Sean A. Irvine
 */
public class A391368 extends Sequence1 {

  private final LongDynamicIntArray mCounts = new LongDynamicIntArray();
  private long mN = 0;
  private long mM = 1;

  @Override
  public Z next() {
    ++mN;
    while (mM <= 4 * mN * mN) {
      final Z s1 = Functions.SIGMA1.z(mM);
      final long s0 = Functions.SIGMA0.l(mM);
      if (s1.mod(s0) == 0) {
        mCounts.increment(s1.divide(s0).longValueExact());
      }
      ++mM;
    }
    return Z.valueOf(mCounts.get(mN));
  }
}
