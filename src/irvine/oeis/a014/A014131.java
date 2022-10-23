package irvine.oeis.a014;

import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A014131 a(n) = 2*a(n-1) if n odd else 2*a(n-1) + 6.
 * @author Sean A. Irvine
 */
public class A014131 extends Sequence0 {

  private Z mA = null;
  private long mN = 0;

  @Override
  public Z next() {
    mA = mA == null ? Z.ZERO : mA.multiply2().add(6 * (++mN & 1));
    return mA;
  }
}
