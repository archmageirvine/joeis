package irvine.oeis.a027;

import irvine.math.z.Z;

/**
 * A027551 Third column of <code>A027538</code>.
 * @author Sean A. Irvine
 */
public class A027551 extends A027538 {

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
