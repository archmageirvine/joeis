package irvine.oeis.a027;

import irvine.math.z.Z;

/**
 * A027501 First diagonal of <code>A027496</code>.
 * @author Sean A. Irvine
 */
public class A027501 extends A027496 {

  private int mN = -1;

  @Override
  public Z next() {
    step();
    return mMatrix.get(++mN, mN).multiply(mLcm).toZ();
  }
}
