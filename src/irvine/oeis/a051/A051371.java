package irvine.oeis.a051;

import irvine.math.z.Z;
import irvine.math.z.ZUtils;
import irvine.oeis.Sequence1;

/**
 * A051371 a(n+1) = a(n) + sum of digits of a(n)^2.
 * @author Sean A. Irvine
 */
public class A051371 extends Sequence1 {

  private Z mA = null;

  @Override
  public Z next() {
    mA = mA == null ? Z.valueOf(197) : mA.add(ZUtils.digitSum(mA.square()));
    return mA;
  }
}

