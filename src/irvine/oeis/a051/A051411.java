package irvine.oeis.a051;

import irvine.math.z.Z;
import irvine.math.z.ZUtils;
import irvine.oeis.Sequence;

/**
 * A051411 a(n+1) = a(n) + sum of digits of a(n)^3.
 * @author Sean A. Irvine
 */
public class A051411 implements Sequence {

  private Z mA = null;

  @Override
  public Z next() {
    mA = mA == null ? Z.SEVEN : mA.add(ZUtils.digitSum(mA.pow(3)));
    return mA;
  }
}

