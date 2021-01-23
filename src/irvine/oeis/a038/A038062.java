package irvine.oeis.a038;

import irvine.math.z.Z;

/**
 * A038062 Number of labeled trees with 3-colored nodes.
 * @author Sean A. Irvine
 */
public class A038062 extends A038061 {

  private boolean mFirst = true;

  @Override
  public Z next() {
    if (mFirst) {
      mFirst = false;
      return Z.ONE;
    }
    return super.next().divide(mN);
  }
}
