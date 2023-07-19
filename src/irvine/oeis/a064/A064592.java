package irvine.oeis.a064;

import irvine.factor.factor.Jaguar;
import irvine.factor.util.FactorSequence;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A064592 Nonunitary doubly perfect numbers: the sum of the nonunitary divisors of n is 2n; i.e., sigma(n) - usigma(n) = 2n.
 * @author Sean A. Irvine
 */
public class A064592 extends Sequence1 {

  private Z mN = Z.valueOf(2519);

  @Override
  public Z next() {
    while (true) {
      mN = mN.add(1);
      final FactorSequence fs = Jaguar.factor(mN);
      if (fs.sigma().subtract(fs.unitarySigma()).equals(mN.multiply2())) {
        return mN;
      }
    }
  }
}

