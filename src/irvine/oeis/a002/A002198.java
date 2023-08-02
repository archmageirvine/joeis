package irvine.oeis.a002;

import irvine.math.z.Z;

/**
 * A002198 Denominators of coefficients for numerical integration.
 * @author Sean A. Irvine
 */
public class A002198 extends A002197 {

  @Override
  public Z next() {
    return nextQ(++mN).den().shiftLeft(2L * mN + 2);
  }
}
