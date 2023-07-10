package irvine.oeis.a064;

import irvine.factor.factor.Jaguar;
import irvine.factor.util.FactorSequence;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A064431 Numbers n such that |A053222(n)| = tau(n).
 * @author Sean A. Irvine
 */
public class A064431 extends Sequence1 {

  private FactorSequence mF = Jaguar.factor(6);
  private long mN = 6;

  @Override
  public Z next() {
    while (true) {
      final FactorSequence f = mF;
      mF = Jaguar.factor(++mN);
      if (f.sigma().subtract(mF.sigma()).abs().equals(f.sigma0())) {
        return Z.valueOf(mN - 1);
      }
    }
  }
}
