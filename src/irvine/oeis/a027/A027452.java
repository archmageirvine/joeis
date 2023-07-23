package irvine.oeis.a027;

import irvine.math.z.Z;

/**
 * A027452 Second diagonal of A027447.
 * @author Sean A. Irvine
 */
public class A027452 extends A027447 {

  {
    setOffset(2);
  }

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
