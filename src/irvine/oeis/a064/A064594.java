package irvine.oeis.a064;

import irvine.factor.factor.Jaguar;
import irvine.factor.util.FactorSequence;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A064594 Nonunitary multiply perfect numbers: the sum of the nonunitary divisors of n is a multiple of n; i.e., n divides sigma(n) - usigma(n).
 * @author Sean A. Irvine
 */
public class A064594 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    while (true) {
      final FactorSequence fs = Jaguar.factor(++mN);
      if (fs.sigma().subtract(fs.unitarySigma()).mod(mN) == 0) {
        return Z.valueOf(mN);
      }
    }
  }
}

