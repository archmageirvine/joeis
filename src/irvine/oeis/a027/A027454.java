package irvine.oeis.a027;

import irvine.math.z.Z;

/**
 * A027454 First diagonal of A027448.
 * @author Sean A. Irvine
 */
public class A027454 extends A027448 {

  private long mN = -1;

  @Override
  public Z next() {
    step();
    return mMatrix.get(++mN, mN).multiply(mLcm).toZ();
  }
}
