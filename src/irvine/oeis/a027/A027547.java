package irvine.oeis.a027;

import irvine.math.z.Z;

/**
 * A027547 Second column of A027537.
 * @author Sean A. Irvine
 */
public class A027547 extends A027537 {

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
    return mMatrix.get(++mN, 1).multiply(mLcm).toZ();
  }
}
