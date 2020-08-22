package irvine.oeis.a027;

import irvine.math.z.Z;

/**
 * A027502 Second diagonal of A027496.
 * @author Sean A. Irvine
 */
public class A027502 extends A027496 {

  private int mN = 0;
  {
    step();
  }

  @Override
  public Z next() {
    step();
    return mMatrix.get(++mN, mN - 1).multiply(mLcm).toZ();
  }
}
