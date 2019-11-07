package irvine.oeis.a027;

import irvine.math.z.Z;

/**
 * A027510 First column of <code>A027496</code>.
 * @author Sean A. Irvine
 */
public class A027510 extends A027496 {

  private int mN = -1;

  @Override
  public Z next() {
    step();
    return mMatrix.get(++mN, 0).multiply(mLcm).toZ();
  }
}
