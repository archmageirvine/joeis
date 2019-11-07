package irvine.oeis.a027;

import irvine.math.z.Z;

/**
 * A027519 First diagonal of <code>A027516</code>.
 * @author Sean A. Irvine
 */
public class A027519 extends A027516 {

  private int mN = -1;

  @Override
  public Z next() {
    step();
    return mMatrix.get(++mN, mN).multiply(mLcm).toZ();
  }
}
