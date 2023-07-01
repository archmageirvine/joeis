package irvine.oeis.a064;

import irvine.factor.factor.Jaguar;
import irvine.factor.util.FactorSequence;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A064351 Numbers n such that n and n+1 have the same sum and number of prime divisors (with repetition).
 * @author Sean A. Irvine
 */
public class A064351 extends Sequence1 {

  private long mN = 6866;

  @Override
  public Z next() {
    while (true) {
      final FactorSequence fs0 = Jaguar.factor(++mN);
      final FactorSequence fs1 = Jaguar.factor(mN + 1);
      if (fs0.bigOmega() == fs1.bigOmega() && fs0.sopfr().equals(fs1.sopfr())) {
        return Z.valueOf(mN);
      }
    }
  }
}

