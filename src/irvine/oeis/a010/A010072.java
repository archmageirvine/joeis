package irvine.oeis.a010;

import irvine.math.z.Z;
import irvine.math.z.ZUtils;
import irvine.oeis.Sequence0;

/**
 * A010072 a(n+1) = a(n) + sum of digits in base 9 representation of a(n).
 * @author Sean A. Irvine
 */
public class A010072 extends Sequence0 {

  private Z mA = null;

  @Override
  public Z next() {
    mA = mA == null ? Z.ONE : mA.add(ZUtils.digitSum(mA, 9));
    return mA;
  }
}

