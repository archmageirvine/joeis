package irvine.oeis.a027;

import irvine.math.z.Z;

/**
 * A027533 Third column of A027517.
 * @author Sean A. Irvine
 */
public class A027533 extends A027517 {

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
