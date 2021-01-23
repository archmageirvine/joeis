package irvine.oeis.a027;

import irvine.math.z.Z;

/**
 * A027521 Third diagonal of A027516.
 * @author Sean A. Irvine
 */
public class A027521 extends A027516 {

  private int mN = 1;
  {
    step();
    step();
  }

  @Override
  public Z next() {
    step();
    return mMatrix.get(++mN, mN - 2).multiply(mLcm).toZ();
  }
}
