package irvine.oeis.a027;

import irvine.math.z.Z;

/**
 * A027499 Second diagonal of <code>A027495</code>.
 * @author Sean A. Irvine
 */
public class A027499 extends A027495 {

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
