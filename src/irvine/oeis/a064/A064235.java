package irvine.oeis.a064;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A064235 The smallest power of 3 that is greater than or equal to n.
 * @author Sean A. Irvine
 */
public class A064235 extends Sequence1 {

  private long mLim = 1;
  private Z mZLim = Z.ONE;
  private long mN = 0;

  @Override
  public Z next() {
    if (++mN > mLim) {
      mLim *= 3L;
      mZLim = Z.valueOf(mLim);
    }
    return mZLim;
  }
}
