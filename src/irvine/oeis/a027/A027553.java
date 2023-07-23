package irvine.oeis.a027;

import irvine.math.z.Z;

/**
 * A027553 Second column of A027539.
 * @author Sean A. Irvine
 */
public class A027553 extends A027539 {

  {
    setOffset(2);
  }

  private int mN = 0;

  {
    step();
  }

  @Override
  public Z next() {
    step();
    return mMatrix.get(++mN, 1).multiply(mLcm).toZ();
  }
}
