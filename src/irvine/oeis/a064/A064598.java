package irvine.oeis.a064;

import irvine.factor.factor.Jaguar;
import irvine.factor.util.FactorSequence;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A064598 Nonunitary deficient numbers: the sum of the nonunitary divisors of n is less than n; i.e., sigma(n) - usigma(n) &lt; n.
 * @author Sean A. Irvine
 */
public class A064598 extends Sequence1 {

  private Z mN = Z.ZERO;

  @Override
  public Z next() {
    while (true) {
      mN = mN.add(1);
      final FactorSequence fs = Jaguar.factor(mN);
      if (fs.sigma().subtract(fs.unitarySigma()).compareTo(mN) < 0) {
        return mN;
      }
    }
  }
}

