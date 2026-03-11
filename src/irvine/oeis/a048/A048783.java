package irvine.oeis.a048;

import irvine.factor.factor.Jaguar;
import irvine.factor.util.FactorSequence;
import irvine.math.z.Z;
import irvine.oeis.a000.A000040;

/**
 * A048783 Numbers k such that prime(k) - sigma(k) - phi(k) = prime(k+1) - sigma(k+1) - phi(k+1), where sigma(k) = sum of divisors of k.
 * @author Sean A. Irvine
 */
public class A048783 extends A000040 {

  private Z mP = super.next();
  private long mN = 0;

  @Override
  public Z next() {
    while (true) {
      final FactorSequence fs0 = Jaguar.factor(++mN);
      final FactorSequence fs1 = Jaguar.factor(mN + 1);
      final Z p0 = mP;
      mP = super.next();
      if (p0.subtract(fs0.sigma()).subtract(fs0.phi()).equals(mP.subtract(fs1.sigma()).subtract(fs1.phi()))) {
        return Z.valueOf(mN);
      }
    }
  }
}
