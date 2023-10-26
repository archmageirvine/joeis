package irvine.oeis.a066;

import irvine.math.z.Z;
import irvine.math.z.ZUtils;
import irvine.oeis.a000.A000040;

/**
 * A100960.
 * @author Sean A. Irvine
 */
public class A066540 extends A000040 {

  private Z mP = super.next();
  private long mSum = ZUtils.digitSum(mP);

  @Override
  public Z next() {
    while (true) {
      final Z q = mP;
      final long sum = mSum;
      mP = super.next();
      mSum = ZUtils.digitSum(mP);
      if (mSum == sum) {
        return q;
      }
    }
  }
}
