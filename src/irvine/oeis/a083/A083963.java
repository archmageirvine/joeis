package irvine.oeis.a083;

import irvine.math.z.Z;

/**
 * A083963 a(n) = A083962(n)/n.
 * @author Sean A. Irvine
 */
public class A083963 extends A083962 {

  @Override
  public Z next() {
    return super.next().divide(mN);
  }
}
