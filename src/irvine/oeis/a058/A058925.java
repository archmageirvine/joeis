package irvine.oeis.a058;

import irvine.math.z.Z;

/**
 * A058925 Number of independent dominating sets in labeled trees with n nodes.
 * @author Sean A. Irvine
 */
public class A058925 extends A058924 {

  @Override
  public Z next() {
    return super.next().divide(mN);
  }
}
