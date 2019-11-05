package irvine.oeis.a027;

import irvine.math.z.Z;

/**
 * A027456 Third diagonal of <code>A027448</code>.
 * @author Sean A. Irvine
 */
public class A027456 extends A027448 {

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
