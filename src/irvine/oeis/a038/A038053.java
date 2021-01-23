package irvine.oeis.a038;

import irvine.math.z.Z;

/**
 * A038053 Number of labeled planted trees with 2-colored leaves.
 * @author Sean A. Irvine
 */
public class A038053 extends A038049 {

  private boolean mFirst = true;

  @Override
  public Z next() {
    if (mFirst) {
      mFirst = false;
      return Z.ZERO;
    }
    return super.next().multiply(mN + 1);
  }
}
