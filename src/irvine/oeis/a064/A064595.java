package irvine.oeis.a064;

import irvine.factor.factor.Jaguar;
import irvine.factor.util.FactorSequence;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A064595 Nontrivial nonunitary multiply perfect numbers: the sum of the nonunitary divisors of n is a positive multiple of n; i.e., (sigma(n) - usigma(n))/n is a positive integer.
 * @author Sean A. Irvine
 */
public class A064595 extends Sequence1 {

  private long mN = 23;

  @Override
  public Z next() {
    while (true) {
      final FactorSequence fs = Jaguar.factor(++mN);
      final Z t = fs.sigma().subtract(fs.unitarySigma());
      if (t.signum() > 0 && t.mod(mN) == 0) {
        return Z.valueOf(mN);
      }
    }
  }
}

