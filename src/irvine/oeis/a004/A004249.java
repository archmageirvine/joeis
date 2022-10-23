package irvine.oeis.a004;

import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A004249 a(n) = (2^2^...^2) (with n 2's) + 1.
 * @author Sean A. Irvine
 */
public class A004249 extends Sequence0 {

  private Z mA = Z.ZERO;

  @Override
  public Z next() {
    mA = Z.ONE.shiftLeft(mA.intValueExact());
    return mA.add(1);
  }
}
