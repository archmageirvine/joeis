package irvine.oeis.a329;

import irvine.math.z.Z;
import irvine.oeis.a027.A027448;

/**
 * A329122 First column of A027448.
 * @author Sean A. Irvine
 */
public class A329122 extends A027448 {

  private long mN = -1;

  @Override
  public Z next() {
    step();
    return mMatrix.get(++mN, 0).multiply(mLcm).toZ();
  }
}
