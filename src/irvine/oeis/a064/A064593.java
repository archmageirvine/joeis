package irvine.oeis.a064;

import irvine.factor.factor.Jaguar;
import irvine.factor.util.FactorSequence;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A064593 Nonunitary triply perfect numbers: the sum of the nonunitary divisors of n is 3n; i.e., sigma(n) - usigma(n) = 3n.
 * @author Sean A. Irvine
 */
public class A064593 extends Sequence1 {

  private Z mN = Z.valueOf(186076799);

  @Override
  public Z next() {
    while (true) {
      mN = mN.add(1);
      final FactorSequence fs = Jaguar.factor(mN);
      if (fs.sigma().subtract(fs.unitarySigma()).equals(mN.multiply(3))) {
        return mN;
      }
    }
  }
}

