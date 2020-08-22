package irvine.oeis.a027;

import irvine.math.z.Z;

/**
 * A027451 First diagonal of A027447.
 * @author Sean A. Irvine
 */
public class A027451 extends A027447 {

  private long mN = -1;

  @Override
  public Z next() {
    step();
    return mMatrix.get(++mN, mN).multiply(mLcm).toZ();
  }
}
