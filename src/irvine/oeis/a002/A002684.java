package irvine.oeis.a002;

import irvine.math.z.Z;

/**
 * A002684 Denominators of coefficients for repeated integration.
 * @author Sean A. Irvine
 */
public class A002684 extends A002683 {

  private int mN = 0;

  @Override
  public Z next() {
    return a(++mN).den();
  }
}
