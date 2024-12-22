package irvine.oeis.a073;

import irvine.math.z.Z;

/**
 * A073655.
 * @author Sean A. Irvine
 */
public class A073876 extends A073875 {

  @Override
  public Z next() {
    return super.next().divide(mN);
  }
}
