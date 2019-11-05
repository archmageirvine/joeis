package irvine.oeis.a027;

import irvine.math.z.Z;

/**
 * A027449 Second diagonal of <code>A027446</code>.
 * @author Sean A. Irvine
 */
public class A027449 extends A027446 {

  private long mN = 0;
  {
    step();
  }

  @Override
  public Z next() {
    step();
    return mMatrix.get(++mN, mN - 1).multiply(mLcm).toZ();
  }
}
