package irvine.oeis.a027;

import irvine.math.z.Z;

/**
 * A027552 First column of A027539.
 * @author Sean A. Irvine
 */
public class A027552 extends A027539 {

  private int mN = -1;

  @Override
  public Z next() {
    step();
    return mMatrix.get(++mN, 0).multiply(mLcm).toZ();
  }
}
