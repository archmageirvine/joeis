package irvine.oeis.a027;

import irvine.math.z.Z;

/**
 * A027541 Third diagonal of A027537.
 * @author Sean A. Irvine
 */
public class A027541 extends A027537 {

  private int mN = 1;
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
