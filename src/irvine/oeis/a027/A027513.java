package irvine.oeis.a027;

import irvine.math.z.Z;

/**
 * A027513 First column of <code>A027497</code>.
 * @author Sean A. Irvine
 */
public class A027513 extends A027497 {

  private int mN = -1;

  @Override
  public Z next() {
    step();
    return mMatrix.get(++mN, 0).multiply(mLcm).toZ();
  }
}
