package irvine.oeis.a068;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.a000.A000040;

/**
 * A068543 Numbers k such that abs(prime(k)-k*tau(k)) &lt; sqrt(k).
 * @author Sean A. Irvine
 */
public class A068543 extends A000040 {

  private Z mN = Z.ZERO;

  @Override
  public Z next() {
    while (true) {
      mN = mN.add(1);
      if (super.next().subtract(Functions.SIGMA0.z(mN).multiply(mN)).abs().square().compareTo(mN) < 0) {
        return mN;
      }
    }
  }
}
