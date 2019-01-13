package irvine.oeis.a006;

import irvine.math.z.Z;
import irvine.math.z.ZUtils;
import irvine.oeis.Sequence;

/**
 * A006507.
 * @author Sean A. Irvine
 */
public class A006507 implements Sequence {

  private Z mA = null;

  @Override
  public Z next() {
    mA = mA == null ? Z.SEVEN : mA.add(ZUtils.digitSum(mA));
    return mA;
  }
}
