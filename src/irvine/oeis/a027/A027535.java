package irvine.oeis.a027;

import irvine.math.z.Z;

/**
 * A027535 Second column of A027518.
 * @author Sean A. Irvine
 */
public class A027535 extends A027518 {

  private int mN = 0;
  {
    step();
  }

  @Override
  public Z next() {
    step();
    return mMatrix.get(++mN, 1).multiply(mLcm).toZ();
  }
}
