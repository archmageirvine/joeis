package irvine.oeis.a079;

import irvine.math.z.Z;

/**
 * A079782 Final term of n-th row of triangle in A079784.
 * @author Sean A. Irvine
 */
public class A079782 extends A079784 {

  private int mN = 0;

  @Override
  public Z next() {
    return mB.get(++mN, mN);
  }
}

