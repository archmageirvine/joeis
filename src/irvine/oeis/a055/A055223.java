package irvine.oeis.a055;

import irvine.math.z.Z;
import irvine.math.z.ZUtils;
import irvine.oeis.a000.A000866;

/**
 * A055223 One-fourth the digital sum of base 5 representations of 2^n.
 * @author Sean A. Irvine
 */
public class A055223 extends A000866 {

  {
    super.next();
    super.next();
  }

  @Override
  public Z next() {
    return Z.valueOf(ZUtils.digitSum(super.next()) / 4);
  }
}
