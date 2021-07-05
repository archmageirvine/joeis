package irvine.oeis.a048;

import irvine.factor.factor.Cheetah;
import irvine.factor.util.FactorSequence;
import irvine.math.z.Z;
import irvine.oeis.a000.A000040;

/**
 * A048791 Numbers n such that n_0=n_1=n_2, where n_i = (n+i)-th prime - sigma(n+i) - phi(n+i).
 * @author Sean A. Irvine
 */
public class A048791 extends A000040 {

  private Z mP1 = super.next();
  private Z mP2 = super.next();
  private long mN = 0;

  @Override
  public Z next() {
    while (true) {
      final FactorSequence fs0 = Cheetah.factor(++mN);
      final FactorSequence fs1 = Cheetah.factor(mN + 1);
      final FactorSequence fs2 = Cheetah.factor(mN + 2);
      final Z p0 = mP1;
      mP1 = mP2;
      mP2 = super.next();
      final Z t = p0.subtract(fs0.sigma()).subtract(fs0.phi());
      if (t.equals(mP1.subtract(fs1.sigma()).subtract(fs1.phi()))
        && t.equals(mP2.subtract(fs2.sigma()).subtract(fs2.phi()))) {
        return Z.valueOf(mN);
      }
    }
  }
}
