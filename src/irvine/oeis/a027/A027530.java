package irvine.oeis.a027;

import irvine.math.z.Z;

/**
 * A027530 Third column of A027516.
 * @author Sean A. Irvine
 */
public class A027530 extends A027516 {

  {
    setOffset(3);
  }

  private int mN = 1;

  {
    step();
    step();
  }

  @Override
  public Z next() {
    step();
    return mMatrix.get(++mN, 2).multiply(mLcm).toZ();
  }
}
