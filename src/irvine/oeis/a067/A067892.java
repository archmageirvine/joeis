package irvine.oeis.a067;

import irvine.factor.factor.Jaguar;
import irvine.factor.util.FactorSequence;
import irvine.math.z.Z;
import irvine.oeis.a000.A000040;

/**
 * A067892 Numbers k such that tau(k)*phi(k) &gt; prime(k) where tau(k) = A000005(k).
 * @author Sean A. Irvine
 */
public class A067892 extends A000040 {

  private long mN = 0;

  @Override
  public Z next() {
    while (true) {
      final FactorSequence fs = Jaguar.factor(++mN);
      if (fs.sigma0().multiply(fs.phi()).compareTo(super.next()) > 0) {
        return Z.valueOf(mN);
      }
    }
  }
}
