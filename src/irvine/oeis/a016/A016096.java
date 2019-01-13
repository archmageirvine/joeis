package irvine.oeis.a016;

import irvine.math.z.Z;
import irvine.math.z.ZUtils;
import irvine.oeis.Sequence;

/**
 * A016096.
 * @author Sean A. Irvine
 */
public class A016096 implements Sequence {

  private Z mA = null;

  @Override
  public Z next() {
    mA = mA == null ? Z.NINE : mA.add(ZUtils.digitSum(mA));
    return mA;
  }
}
