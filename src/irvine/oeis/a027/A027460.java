package irvine.oeis.a027;

import irvine.math.z.Z;

/**
 * A027460 Second column of A027447.
 * @author Sean A. Irvine
 */
public class A027460 extends A027447 {

  private long mN = 0;
  {
    step();
  }

  @Override
  public Z next() {
    step();
    return mMatrix.get(++mN, 1).multiply(mLcm).toZ();
  }
}
