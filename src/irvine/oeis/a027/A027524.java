package irvine.oeis.a027;

import irvine.math.z.Z;

/**
 * A027524 Third diagonal of A027517.
 * @author Sean A. Irvine
 */
public class A027524 extends A027517 {

  {
    setOffset(3);
  }

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
