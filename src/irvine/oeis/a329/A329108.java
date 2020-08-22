package irvine.oeis.a329;

import irvine.math.z.Z;
import irvine.oeis.a027.A027447;

/**
 * A329108 First column of A027447.
 * @author Sean A. Irvine
 */
public class A329108 extends A027447 {

  private long mN = -1;

  @Override
  public Z next() {
    step();
    return mMatrix.get(++mN, 0).multiply(mLcm).toZ();
  }
}
