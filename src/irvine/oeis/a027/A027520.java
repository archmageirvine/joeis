package irvine.oeis.a027;

import irvine.math.z.Z;

/**
 * A027520 Second diagonal of A027516.
 * @author Sean A. Irvine
 */
public class A027520 extends A027516 {

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
