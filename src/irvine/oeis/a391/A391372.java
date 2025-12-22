package irvine.oeis.a391;

import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A391372 a(n) = 2*a(n-1)^2 + a(n-1) + 1 with a(0) = 0.
 * @author Sean A. Irvine
 */
public class A391372 extends Sequence0 {

  private Z mA = null;

  @Override
  public Z next() {
    mA = mA == null ? Z.ZERO : mA.square().multiply2().add(mA).add(1);
    return mA;
  }
}
