package irvine.oeis.a027;

import irvine.math.z.Z;

/**
 * A027507 First column of A027495.
 * @author Sean A. Irvine
 */
public class A027507 extends A027495 {

  private int mN = -1;

  @Override
  public Z next() {
    step();
    return mMatrix.get(++mN, 0).multiply(mLcm).toZ();
  }
}
