package irvine.oeis.a002;

import irvine.math.z.Z;

/**
 * A002406 Coefficients for step-by-step integration.
 * @author Sean A. Irvine
 */
public class A002406 extends A002402 {

  {
    setOffset(0);
  }

  private int mN = -1;

  @Override
  public Z next() {
    return deltaStar(++mN, mN + 1);
  }
}

