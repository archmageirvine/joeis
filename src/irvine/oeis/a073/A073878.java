package irvine.oeis.a073;

import irvine.math.z.Z;

/**
 * A073878 A073877 divided by n.
 * @author Sean A. Irvine
 */
public class A073878 extends A073877 {

  @Override
  public Z next() {
    return super.next().divide(mN);
  }
}
