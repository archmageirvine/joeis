package irvine.oeis.a027;

import irvine.math.z.Z;

/**
 * A027512 Third column of A027496.
 * @author Sean A. Irvine
 */
public class A027512 extends A027496 {

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
    return mMatrix.get(++mN, 2).multiply(mLcm).toZ();
  }
}
