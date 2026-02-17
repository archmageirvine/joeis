package irvine.oeis.a083;

import irvine.math.z.Z;

/**
 * A083799 Main diagonal of A083798.
 * @author Sean A. Irvine
 */
public class A083802 extends A083799 {

  @Override
  public Z next() {
    return super.next().divide(mN + 1);
  }
}
