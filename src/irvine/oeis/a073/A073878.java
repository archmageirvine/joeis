package irvine.oeis.a073;

import irvine.math.z.Z;

/**
 * A073655.
 * @author Sean A. Irvine
 */
public class A073878 extends A073877 {

  @Override
  public Z next() {
    return super.next().divide(mN);
  }
}
