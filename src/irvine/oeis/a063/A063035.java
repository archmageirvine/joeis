package irvine.oeis.a063;

import irvine.factor.factor.Jaguar;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A063035 Number of integers m &lt;= 10^n that contain a square factor (i.e., belong to A013929).
 * @author Sean A. Irvine
 */
public class A063035 extends Sequence1 {

  private long mN = 0;
  private long mLim = 10;
  private long mC = 0;

  @Override
  public Z next() {
    while (true) {
      if (mN == mLim) {
        mLim *= 10;
        return Z.valueOf(mC);
      }
      if (Jaguar.factor(++mN).maxExponent() > 1) {
        ++mC;
      }
    }
  }
}
