package irvine.oeis.a027;

import irvine.math.z.Z;

/**
 * A027463 Second column of A027448.
 * @author Sean A. Irvine
 */
public class A027463 extends A027448 {

  {
    setOffset(2);
  }

  private long mN = 0;

  {
    step();
  }

  @Override
  public Z next() {
    step();
    return mMatrix.get(++mN, 1).multiply(mLcm).toZ();
  }
}
