package irvine.oeis.a027;

import irvine.math.z.Z;

/**
 * A027534 First column of <code>A027518</code>.
 * @author Sean A. Irvine
 */
public class A027534 extends A027518 {

  private int mN = -1;

  @Override
  public Z next() {
    step();
    return mMatrix.get(++mN, 0).multiply(mLcm).toZ();
  }
}
