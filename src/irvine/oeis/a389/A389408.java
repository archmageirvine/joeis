package irvine.oeis.a389;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A389408 allocated for Xander Lee Luo.
 * @author Sean A. Irvine
 */
public class A389408 extends Sequence1 {

  private Z mA = null;

  @Override
  public Z next() {
    mA = mA == null ? Z.TWO : mA.add(Functions.GPF.z(mA)).subtract(1);
    return mA;
  }
}
