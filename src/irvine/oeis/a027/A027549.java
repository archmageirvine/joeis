package irvine.oeis.a027;

import irvine.math.z.Z;

/**
 * A027549 First column of A027538.
 * @author Sean A. Irvine
 */
public class A027549 extends A027538 {

  private int mN = -1;

  @Override
  public Z next() {
    step();
    return mMatrix.get(++mN, 0).multiply(mLcm).toZ();
  }
}
