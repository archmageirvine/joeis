package irvine.oeis.a027;

import irvine.math.z.Z;

/**
 * A027450 Third diagonal of <code>A027446</code>.
 * @author Sean A. Irvine
 */
public class A027450 extends A027446 {

  private long mN = 1;
  {
    step();
    step();
  }

  @Override
  public Z next() {
    step();
    return mMatrix.get(++mN, mN - 2).multiply(mLcm).toZ();
  }
}
