package irvine.oeis.a027;

import irvine.math.z.Z;

/**
 * A027542 Second diagonal of A027538.
 * @author Sean A. Irvine
 */
public class A027542 extends A027538 {

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
