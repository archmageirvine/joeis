package irvine.oeis.a064;

import irvine.factor.factor.Jaguar;
import irvine.factor.util.FactorSequence;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A064599 The sum of the nonunitary divisors of n is a divisor of n; i.e., sigma(n) - usigma(n) divides n.
 * @author Sean A. Irvine
 */
public class A064599 extends Sequence1 {

  private Z mN = Z.THREE;

  @Override
  public Z next() {
    while (true) {
      mN = mN.add(1);
      final FactorSequence fs = Jaguar.factor(mN);
      final Z t = fs.sigma().subtract(fs.unitarySigma());
      if (!t.isZero() && mN.mod(t).isZero()) {
        return mN;
      }
    }
  }
}

