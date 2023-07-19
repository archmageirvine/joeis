package irvine.oeis.a064;

import irvine.factor.factor.Jaguar;
import irvine.factor.util.FactorSequence;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A064597 Nonunitary abundant numbers: the sum of the nonunitary divisors of n is larger than n; i.e., sigma(n) - usigma(n) &gt; n.
 * @author Sean A. Irvine
 */
public class A064597 extends Sequence1 {

  private Z mN = Z.valueOf(35);

  @Override
  public Z next() {
    while (true) {
      mN = mN.add(1);
      final FactorSequence fs = Jaguar.factor(mN);
      if (fs.sigma().subtract(fs.unitarySigma()).compareTo(mN) > 0) {
        return mN;
      }
    }
  }
}

