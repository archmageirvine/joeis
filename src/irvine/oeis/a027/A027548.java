package irvine.oeis.a027;

import irvine.math.z.Z;

/**
 * A027548 Third column of <code>A027537</code>.
 * @author Sean A. Irvine
 */
public class A027548 extends A027537 {

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
