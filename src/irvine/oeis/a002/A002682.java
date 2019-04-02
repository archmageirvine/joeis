package irvine.oeis.a002;

import irvine.math.z.Z;

/**
 * A002682 Denominators of coefficients for repeated integration.
 * @author Sean A. Irvine
 */
public class A002682 extends A002681 {

  private int mN = 0;

  @Override
  public Z next() {
    return a(++mN).den();
  }
}
