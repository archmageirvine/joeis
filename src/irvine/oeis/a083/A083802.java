package irvine.oeis.a083;

import irvine.math.z.Z;

/**
 * A083802 a(n) = A083799(n)/n.
 * @author Sean A. Irvine
 */
public class A083802 extends A083799 {

  @Override
  public Z next() {
    return super.next().divide(mN + 1);
  }
}
