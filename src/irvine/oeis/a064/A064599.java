package irvine.oeis.a064;

import irvine.factor.factor.Jaguar;
import irvine.factor.util.FactorSequence;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A064599 Numbers k such that the sum of the nonunitary divisors of k is a divisor of k; i.e., sigma(k) - usigma(k) divides k.
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

