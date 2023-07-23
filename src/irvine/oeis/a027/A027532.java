package irvine.oeis.a027;

import irvine.math.z.Z;

/**
 * A027532 Second column of A027517.
 * @author Sean A. Irvine
 */
public class A027532 extends A027517 {

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
