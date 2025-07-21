package irvine.oeis.a078;

import irvine.math.z.Z;

/**
 * A078810 a(n) = A078218(n)/n.
 * @author Sean A. Irvine
 */
public class A078810 extends A078218 {

  @Override
  public Z next() {
    return super.next().divide(mN);
  }
}
