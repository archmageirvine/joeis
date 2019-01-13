package irvine.oeis.a004;

import irvine.math.z.Z;
import irvine.math.z.ZUtils;
import irvine.oeis.Sequence;

/**
 * A004152.
 * @author Sean A. Irvine
 */
public class A004152 implements Sequence {

  private Z mF = Z.ONE;
  private long mN = -1;

  @Override
  public Z next() {
    if (++mN > 1) {
      mF = mF.multiply(mN);
    }
    return Z.valueOf(ZUtils.digitSum(mF));
  }
}
