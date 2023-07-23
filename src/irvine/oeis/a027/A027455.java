package irvine.oeis.a027;

import irvine.math.z.Z;

/**
 * A027455 Second diagonal of A027448.
 * @author Sean A. Irvine
 */
public class A027455 extends A027448 {

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
