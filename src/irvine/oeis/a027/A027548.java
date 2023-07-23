package irvine.oeis.a027;

import irvine.math.z.Z;

/**
 * A027548 Third column of A027537.
 * @author Sean A. Irvine
 */
public class A027548 extends A027537 {

  {
    setOffset(3);
  }

  private int mN = 1;

  {
    step();
    step();
  }

  @Override
  public Z next() {
    step();
    return mMatrix.get(++mN, 2).multiply(mLcm).toZ();
  }
}
