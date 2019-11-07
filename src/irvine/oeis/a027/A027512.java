package irvine.oeis.a027;

import irvine.math.z.Z;

/**
 * A027512 Third column of <code>A027496</code>.
 * @author Sean A. Irvine
 */
public class A027512 extends A027496 {

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
