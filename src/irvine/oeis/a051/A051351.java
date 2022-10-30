package irvine.oeis.a051;

import irvine.math.z.Z;
import irvine.math.z.ZUtils;
import irvine.oeis.a000.A000040;

/**
 * A051351 a(n) = a(n-1) + sum of digits of n-th prime.
 * @author Sean A. Irvine
 */
public class A051351 extends A000040 {

  {
    setOffset(0);
  }

  private Z mA = null;

  @Override
  public Z next() {
    mA = mA == null ? Z.ZERO : mA.add(ZUtils.digitSum(super.next()));
    return mA;
  }
}
