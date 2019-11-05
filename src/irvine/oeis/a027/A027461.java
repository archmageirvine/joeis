package irvine.oeis.a027;

import irvine.math.z.Z;

/**
 * A027461 Third column of <code>A027447</code>.
 * @author Sean A. Irvine
 */
public class A027461 extends A027447 {

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
