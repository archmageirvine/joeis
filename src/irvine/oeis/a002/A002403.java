package irvine.oeis.a002;

import irvine.math.z.Z;

/**
 * A002403 Coefficients for step-by-step integration.
 * @author Sean A. Irvine
 */
public class A002403 extends A002402 {

  private int mN = 1;

  @Override
  public Z next() {
    return deltaStar(2, ++mN).abs();
  }
}
