package irvine.oeis.a006;

import irvine.math.z.Z;
import irvine.oeis.a002.A002198;

/**
 * A006685 Coefficients for numerical integration.
 * @author Sean A. Irvine
 */
public class A006685 extends A002198 {

  @Override
  public Z next() {
    return super.next().divide(2 * mN + 1);
  }
}
