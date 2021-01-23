package irvine.oeis.a027;

import irvine.math.z.Z;

/**
 * A027522 First diagonal of A027517.
 * @author Sean A. Irvine
 */
public class A027522 extends A027517 {

  private int mN = -1;

  @Override
  public Z next() {
    step();
    return mMatrix.get(++mN, mN).multiply(mLcm).toZ();
  }
}
