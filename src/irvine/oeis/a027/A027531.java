package irvine.oeis.a027;

import irvine.math.z.Z;

/**
 * A027531 First column of <code>A027517</code>.
 * @author Sean A. Irvine
 */
public class A027531 extends A027517 {

  private int mN = -1;

  @Override
  public Z next() {
    step();
    return mMatrix.get(++mN, 0).multiply(mLcm).toZ();
  }
}
