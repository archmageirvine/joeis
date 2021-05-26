package irvine.oeis.a047;

import irvine.math.z.Z;
import irvine.math.z.ZUtils;
import irvine.oeis.Sequence;

/**
 * A047901 a(1) = 9; a(n+1) = a(n) * sum of decimal digits of a(n).
 * @author Sean A. Irvine
 */
public class A047901 implements Sequence {

  private Z mA = null;

  @Override
  public Z next() {
    mA = mA == null ? Z.NINE : mA.multiply(ZUtils.digitSum(mA));
    return mA;
  }
}
