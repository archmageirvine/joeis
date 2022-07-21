package irvine.oeis.a058;

import irvine.math.z.Z;
import irvine.math.z.ZUtils;
import irvine.oeis.a000.A000040;

/**
 * A058049.
 * @author Sean A. Irvine
 */
public class A058049 extends A000040 {

  private long mN = 0;
  private Z mSum = Z.ZERO;

  @Override
  public Z next() {
    while (true) {
      ++mN;
      mSum = mSum.add(ZUtils.digitSum(super.next()));
      if (mSum.isProbablePrime()) {
        return Z.valueOf(mN);
      }
    }
  }
}
