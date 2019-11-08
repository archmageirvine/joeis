package irvine.oeis.a027;

import irvine.math.z.Z;

/**
 * A027550 Second column of <code>A027538</code>.
 * @author Sean A. Irvine
 */
public class A027550 extends A027538 {

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
