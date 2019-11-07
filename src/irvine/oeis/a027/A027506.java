package irvine.oeis.a027;

import irvine.math.z.Z;

/**
 * A027506 Third diagonal of <code>A027497</code>.
 * @author Sean A. Irvine
 */
public class A027506 extends A027497 {

  private int mN = 1;
  {
    step();
    step();
  }

  @Override
  public Z next() {
    step();
    return mMatrix.get(++mN, mN - 2).multiply(mLcm).toZ();
  }
}
