package irvine.oeis.a027;

import irvine.math.z.Z;

/**
 * A027528 First column of <code>A027516</code>.
 * @author Sean A. Irvine
 */
public class A027528 extends A027516 {

  private int mN = -1;

  @Override
  public Z next() {
    step();
    return mMatrix.get(++mN, 0).multiply(mLcm).toZ();
  }
}
