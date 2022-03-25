package irvine.oeis.a055;

import irvine.math.z.Z;

/**
 * A055526 Shortest hypotenuse of a Pythagorean triangle with n as length of a leg.
 * @author Sean A. Irvine
 */
public class A055526 extends A055527 {

  @Override
  public Z next() {
    return super.next().square().add(mN * mN).sqrt();
  }
}
