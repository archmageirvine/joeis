package irvine.oeis.a068;

import irvine.factor.factor.Jaguar;
import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.a000.A000040;

/**
 * A068356 Numbers k such that bigomega(k) = tau(prime(k)+1) where tau(k) = A000005(k).
 * @author Sean A. Irvine
 */
public class A068356 extends A000040 {

  private long mN = 0;

  @Override
  public Z next() {
    while (true) {
      final long s0 = Functions.SIGMA0.l(super.next().add(1));
      if (Jaguar.factor(++mN).bigOmega() == s0) {
        return Z.valueOf(mN);
      }
    }
  }
}
