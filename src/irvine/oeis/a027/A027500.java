package irvine.oeis.a027;

import irvine.math.z.Z;

/**
 * A027500 Third diagonal of A027495.
 * @author Sean A. Irvine
 */
public class A027500 extends A027495 {

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
