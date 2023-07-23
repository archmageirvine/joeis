package irvine.oeis.a027;

import irvine.math.z.Z;

/**
 * A027554 Third column of A027539.
 * @author Sean A. Irvine
 */
public class A027554 extends A027539 {

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
