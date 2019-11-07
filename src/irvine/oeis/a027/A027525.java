package irvine.oeis.a027;

import irvine.math.z.Z;

/**
 * A027525 First diagonal of <code>A027518</code>.
 * @author Sean A. Irvine
 */
public class A027525 extends A027518 {

  private int mN = -1;

  @Override
  public Z next() {
    step();
    return mMatrix.get(++mN, mN).multiply(mLcm).toZ();
  }
}
