package irvine.oeis.a069;

import irvine.math.z.Z;
import irvine.math.z.ZUtils;
import irvine.oeis.Sequence1;

/**
 * A069003.
 * @author Sean A. Irvine
 */
public class A069029 extends Sequence1 {

  private Z mA = null;
  private long mRecord = -1;

  @Override
  public Z next() {
    while (true) {
      mA = mA == null ? Z.ONE : mA.shiftLeft(2);
      final long ds = ZUtils.digitSum(mA);
      if (ds > mRecord) {
        mRecord = ds;
        return mA;
      }
    }
  }
}

