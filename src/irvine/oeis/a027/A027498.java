package irvine.oeis.a027;

import irvine.math.z.Z;

/**
 * A027498 First diagonal of A027495.
 * @author Sean A. Irvine
 */
public class A027498 extends A027495 {

  private int mN = -1;

  @Override
  public Z next() {
    step();
    return mMatrix.get(++mN, mN).multiply(mLcm).toZ();
  }
}
