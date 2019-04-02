package irvine.oeis.a007;

import irvine.math.z.Z;

/**
 * A007213 Oscillates under partition transform.
 * @author Sean A. Irvine
 */
public class A007213 extends A007212 {

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

