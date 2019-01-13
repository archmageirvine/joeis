package irvine.oeis.a007;

import irvine.math.z.Z;
import irvine.math.z.ZUtils;
import irvine.oeis.a000.A000040;

/**
 * A007605.
 * @author Sean A. Irvine
 */
public class A007605 extends A000040 {

  @Override
  public Z next() {
    return Z.valueOf(ZUtils.digitSum(super.next()));
  }
}
