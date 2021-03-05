package irvine.oeis.a002;

import irvine.math.z.Z;

/**
 * A002399 Coefficients for step-by-step integration.
 * @author Sean A. Irvine
 */
public class A002399 extends A002398 {

  private int mN = 0;

  @Override
  public Z next() {
    return delta(1, ++mN).abs();
  }
}
