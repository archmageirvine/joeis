package irvine.oeis.a027;

import irvine.math.z.Z;

/**
 * A027515 Third column of <code>A027497</code>.
 * @author Sean A. Irvine
 */
public class A027515 extends A027497 {

  private int mN = 1;
  {
    step();
    step();
  }

  @Override
  public Z next() {
    step();
    return mMatrix.get(++mN, 2).multiply(mLcm).toZ();
  }
}
