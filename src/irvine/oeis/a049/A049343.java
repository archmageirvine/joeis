package irvine.oeis.a049;

import irvine.math.z.Z;
import irvine.math.z.ZUtils;
import irvine.oeis.Sequence1;

/**
 * A049343 Numbers m such that 2m and m^2 have same digit sum.
 * @author Sean A. Irvine
 */
public class A049343 extends Sequence1 {

  private Z mN = Z.NEG_ONE;

  @Override
  public Z next() {
    while (true) {
      mN = mN.add(1);
      if (ZUtils.digitSum(mN.multiply2()) == ZUtils.digitSum(mN.square())) {
        return mN;
      }
    }
  }
}
