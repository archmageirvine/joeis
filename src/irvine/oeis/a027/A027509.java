package irvine.oeis.a027;

import irvine.math.z.Z;

/**
 * A027509 Third column of A027495.
 * @author Sean A. Irvine
 */
public class A027509 extends A027495 {

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
