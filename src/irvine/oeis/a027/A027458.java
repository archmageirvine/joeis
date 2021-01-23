package irvine.oeis.a027;

import irvine.math.z.Z;

/**
 * A027458 Third column of A027446.
 * @author Sean A. Irvine
 */
public class A027458 extends A027446 {

  private long mN = 1;
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
