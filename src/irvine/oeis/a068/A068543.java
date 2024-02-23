package irvine.oeis.a068;

import irvine.factor.factor.Jaguar;
import irvine.math.z.Z;
import irvine.oeis.a000.A000040;

/**
 * A068543 Numbers n such that abs(prime(n)-n*tau(n)) &lt; sqrt(n).
 * @author Sean A. Irvine
 */
public class A068543 extends A000040 {

  private Z mN = Z.ZERO;

  @Override
  public Z next() {
    while (true) {
      mN = mN.add(1);
      if (super.next().subtract(Jaguar.factor(mN).sigma0().multiply(mN)).abs().square().compareTo(mN) < 0) {
        return mN;
      }
    }
  }
}
