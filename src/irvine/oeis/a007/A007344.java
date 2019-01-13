package irvine.oeis.a007;

import irvine.math.z.Z;

/**
 * A007344.
 * @author Sean A. Irvine
 */
public class A007344 extends A007343 {

  private int mN = 3;
  private Z mA = Z.ZERO;

  @Override
  public Z next() {
    ++mN;
    mA = mA.add(get(mN, 3));
    return mA;
  }
}
