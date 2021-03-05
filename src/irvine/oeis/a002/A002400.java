package irvine.oeis.a002;

import irvine.math.z.Z;

/**
 * A002400 Coefficients for step-by-step integration.
 * @author Sean A. Irvine
 */
public class A002400 extends A002398 {

  private int mN = 1;

  @Override
  public Z next() {
    return delta(2, ++mN).abs();
  }
}
