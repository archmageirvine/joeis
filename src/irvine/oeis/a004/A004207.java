package irvine.oeis.a004;

import irvine.math.z.Z;
import irvine.math.z.ZUtils;
import irvine.oeis.Sequence0;

/**
 * A004207 a(0) = 1, a(n) = sum of digits of all previous terms.
 * @author Sean A. Irvine
 */
public class A004207 extends Sequence0 {

  private Z mA = null;
  private boolean mFirst = true;

  @Override
  public Z next() {
    if (mFirst) {
      mFirst = false;
      return Z.ONE;
    }
    mA = mA == null ? Z.ONE : mA.add(ZUtils.digitSum(mA));
    return mA;
  }
}
