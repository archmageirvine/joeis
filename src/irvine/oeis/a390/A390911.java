package irvine.oeis.a390;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;
import irvine.util.array.LongDynamicBooleanArray;

/**
 * A390911 Odd numbers k for which tau(x) + phi(x) = k has at least one solution.
 * @author Sean A. Irvine
 */
public class A390911 extends Sequence1 {

  private final LongDynamicBooleanArray mSeen = new LongDynamicBooleanArray();
  private long mN = 1;
  private long mM = 0;

  @Override
  public Z next() {
    while (true) {
      mN += 2;
      final double log = Math.log(mN);
      final double lim = log * log * mN;
      while (mM < lim) {
        ++mM;
        mSeen.set(Functions.PHI.l(mM) + Functions.SIGMA0.l(mM));
      }
      if (mSeen.isSet(mN)) {
        return Z.valueOf(mN);
      }
    }
  }
}
