package irvine.oeis.a007;

import irvine.math.z.Z;

/**
 * A007211.
 * @author Sean A. Irvine
 */
public class A007211 extends A007210 {

  private int mN = 0;

  @Override
  public Z next() {
    super.next();
    while (mB == null) {
      super.next();
    }
    return mB.coeff(++mN);
  }
}

