package irvine.oeis.a027;

import irvine.math.z.Z;

/**
 * A027546 First column of <code>A027537</code>.
 * @author Sean A. Irvine
 */
public class A027546 extends A027537 {

  private int mN = -1;

  @Override
  public Z next() {
    step();
    return mMatrix.get(++mN, 0).multiply(mLcm).toZ();
  }
}
