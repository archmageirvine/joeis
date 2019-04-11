package irvine.oeis.a004;

import irvine.math.z.Z;
import irvine.math.z.ZUtils;
import irvine.oeis.a000.A000244;

/**
 * A004166 Sum of digits of <code>3^n</code>.
 * @author Sean A. Irvine
 */
public class A004166 extends A000244 {

  @Override
  public Z next() {
    return Z.valueOf(ZUtils.digitSum(super.next()));
  }
}
