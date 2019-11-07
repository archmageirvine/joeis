package irvine.oeis.a027;

import irvine.math.z.Z;

/**
 * A027508 Second column of <code>A027495</code>.
 * @author Sean A. Irvine
 */
public class A027508 extends A027495 {

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
