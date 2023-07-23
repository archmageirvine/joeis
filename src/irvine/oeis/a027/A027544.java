package irvine.oeis.a027;

import irvine.math.z.Z;

/**
 * A027544 Second diagonal of A027539.
 * @author Sean A. Irvine
 */
public class A027544 extends A027539 {

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
    return mMatrix.get(++mN, mN - 1).multiply(mLcm).toZ();
  }
}
