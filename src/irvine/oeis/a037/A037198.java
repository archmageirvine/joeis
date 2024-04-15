package irvine.oeis.a037;

import irvine.factor.factor.Jaguar;
import irvine.factor.util.FactorSequence;
import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A037198 Number of divisors of (sigma(n)-n) = number of divisors of n.
 * @author Sean A. Irvine
 */
public class A037198 extends Sequence1 {

  private long mN = 5;

  @Override
  public Z next() {
    while (true) {
      final FactorSequence fs = Jaguar.factor(++mN);
      if (Functions.SIGMA0.z(fs.sigma().subtract(mN)).equals(fs.sigma0())) {
        return Z.valueOf(mN);
      }
    }
  }
}
