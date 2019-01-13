package irvine.oeis.a004;

import irvine.math.z.Z;
import irvine.math.z.ZUtils;
import irvine.oeis.a000.A000292;

/**
 * A004160.
 * @author Sean A. Irvine
 */
public class A004160 extends A000292 {

  {
    super.next();
  }

  @Override
  public Z next() {
    return Z.valueOf(ZUtils.digitSum(super.next()));
  }
}
