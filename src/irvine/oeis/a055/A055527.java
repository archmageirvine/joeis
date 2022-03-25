package irvine.oeis.a055;

import irvine.math.z.Z;
import irvine.oeis.a054.A054436;

/**
 * A055527 Shortest other leg of a Pythagorean triangle with n as length of a leg.
 * @author Sean A. Irvine
 */
public class A055527 extends A054436 {

  @Override
  public Z next() {
    return super.next().multiply2().divide(mN);
  }
}
