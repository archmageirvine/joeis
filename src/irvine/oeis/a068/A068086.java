package irvine.oeis.a068;

import irvine.math.z.Z;
import irvine.oeis.a036.A036229;

/**
 * A068086 a(n) = A036229(n) - 111...1 (with n 1's).
 * @author Sean A. Irvine
 */
public class A068086 extends A036229 {

  private Z mA = Z.ZERO;

  @Override
  public Z next() {
    mA = mA.multiply(10).add(1);
    return super.next().subtract(mA);
  }
}
