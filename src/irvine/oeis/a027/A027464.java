package irvine.oeis.a027;

import irvine.math.z.Z;

/**
 * A027464 Third column of A027448.
 * @author Sean A. Irvine
 */
public class A027464 extends A027448 {

  {
    setOffset(3);
  }

  private long mN = 1;

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
