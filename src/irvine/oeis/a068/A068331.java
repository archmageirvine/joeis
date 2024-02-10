package irvine.oeis.a068;

import java.util.HashSet;

import irvine.math.z.Z;
import irvine.math.z.ZUtils;
import irvine.oeis.Sequence1;

/**
 * A068331 This number of zeros cannot occur in any factorial.
 * @author Sean A. Irvine
 */
public class A068331 extends Sequence1 {

  private final HashSet<Long> mSeen = new HashSet<>();
  private Z mF = Z.ONE;
  private long mTrailingZeros = 0;
  private long mN = 0;
  private long mM = 2;

  @Override
  public Z next() {
    while (true) {
      ++mM;
      while (mM > mTrailingZeros) {
        mF = mF.multiply(++mN);
        while (mF.mod(10) == 0) {
          ++mTrailingZeros;
          mF = mF.divide(10);
        }
        final int[] counts = ZUtils.digitCounts(mF);
        mSeen.add(mTrailingZeros + counts[0]);
      }
      if (!mSeen.remove(mM)) {
        return Z.valueOf(mM);
      }
    }
  }
}
