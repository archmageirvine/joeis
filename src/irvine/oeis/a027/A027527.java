package irvine.oeis.a027;

import irvine.math.z.Z;

/**
 * A027527 Third diagonal of A027518.
 * @author Sean A. Irvine
 */
public class A027527 extends A027518 {

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
