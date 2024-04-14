package irvine.oeis.a069;

import irvine.factor.factor.Jaguar;
import irvine.factor.util.FactorSequence;
import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A069225 Numbers n such that phi(n) is the reversal of sigma(n).
 * @author Sean A. Irvine
 */
public class A069225 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    while (true) {
      final FactorSequence fs = Jaguar.factor(++mN);
      if (fs.phi().equals(Functions.REVERSE.z(fs.sigma()))) {
        return Z.valueOf(mN);
      }
    }
  }
}

