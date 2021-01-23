package irvine.oeis.a027;

import irvine.math.z.Z;

/**
 * A027504 First diagonal of A027497.
 * @author Sean A. Irvine
 */
public class A027504 extends A027497 {

  private int mN = -1;

  @Override
  public Z next() {
    step();
    return mMatrix.get(++mN, mN).multiply(mLcm).toZ();
  }
}
