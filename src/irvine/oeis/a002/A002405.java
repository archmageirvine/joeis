package irvine.oeis.a002;

import irvine.math.z.Z;

/**
 * A002405 Coefficients for step-by-step integration.
 * @author Sean A. Irvine
 */
public class A002405 extends A002402 {

  {
    setOffset(0);
  }

  private int mN = -1;

  @Override
  public Z next() {
    return alefStar(++mN);
  }
}
