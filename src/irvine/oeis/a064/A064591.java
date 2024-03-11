package irvine.oeis.a064;

import irvine.factor.factor.Jaguar;
import irvine.factor.util.FactorSequence;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A064591 Nonunitary perfect numbers: k is the sum of its nonunitary divisors; i.e., k = sigma(k) - usigma(k).
 * @author Sean A. Irvine
 */
public class A064591 extends Sequence1 {

  private Z mN = Z.valueOf(23);

  @Override
  public Z next() {
    while (true) {
      mN = mN.add(1);
      final FactorSequence fs = Jaguar.factor(mN);
      if (fs.sigma().subtract(fs.unitarySigma()).equals(mN)) {
        return mN;
      }
    }
  }
}

