package irvine.oeis.a064;

import irvine.factor.factor.Jaguar;
import irvine.factor.util.FactorSequence;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A064348 Numbers k such that k and k+1 have the same sum of unitary divisors and the same number of divisors.
 * @author Sean A. Irvine
 */
public class A064348 extends Sequence1 {

  private long mN = 13;

  @Override
  public Z next() {
    while (true) {
      final FactorSequence fs0 = Jaguar.factor(++mN);
      final FactorSequence fs1 = Jaguar.factor(mN + 1);
      if (fs0.unitarySigma().equals(fs1.unitarySigma()) && fs0.sigma0().equals(fs1.sigma0())) {
        return Z.valueOf(mN);
      }
    }
  }
}

