package irvine.oeis.a027;

import irvine.math.z.Z;

/**
 * A027453 Third diagonal of A027447.
 * @author Sean A. Irvine
 */
public class A027453 extends A027447 {

  private long mN = 1;
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
