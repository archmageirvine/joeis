package irvine.oeis.a027;

import irvine.math.z.Z;

/**
 * A027505 Second diagonal of A027497.
 * @author Sean A. Irvine
 */
public class A027505 extends A027497 {

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
