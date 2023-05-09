package irvine.oeis.a063;

import irvine.factor.factor.Jaguar;
import irvine.factor.util.FactorSequence;
import irvine.math.z.Z;
import irvine.oeis.a000.A000040;

/**
 * A063690 Numbers n such that n-th prime - phi(n) - d(n) = (n+1)-th prime - phi(n+1) - d(n+1), where d(n) = number of divisors of n.
 * @author Sean A. Irvine
 */
public class A063690 extends A000040 {

  private long mN = 1;
  private Z mA = super.next().subtract(2);

  @Override
  public Z next() {
    while (true) {
      final Z t = mA;
      final FactorSequence fs = Jaguar.factor(++mN);
      mA = super.next().subtract(fs.phi().add(fs.sigma0()));
      if (mA.equals(t)) {
        return Z.valueOf(mN - 1);
      }
    }
  }
}

