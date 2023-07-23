package irvine.oeis.a027;

import irvine.math.z.Z;

/**
 * A027526 Second diagonal of A027518.
 * @author Sean A. Irvine
 */
public class A027526 extends A027518 {

  {
    setOffset(2);
  }

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
