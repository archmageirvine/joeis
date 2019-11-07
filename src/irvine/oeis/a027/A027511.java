package irvine.oeis.a027;

import irvine.math.z.Z;

/**
 * A027511 Second column of <code>A027496</code>.
 * @author Sean A. Irvine
 */
public class A027511 extends A027496 {

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
