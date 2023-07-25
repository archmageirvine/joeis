package irvine.oeis.a064;

import irvine.factor.factor.Jaguar;
import irvine.factor.util.FactorSequence;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A064729 Numbers k such that k and k+1 have the same sum of unitary and nonunitary divisors.
 * @author Sean A. Irvine
 */
public class A064729 extends Sequence1 {

  private long mN = 13;

  @Override
  public Z next() {
    while (true) {
      final FactorSequence a = Jaguar.factor(++mN);
      final FactorSequence b = Jaguar.factor(mN + 1);
      if (a.sigma().equals(b.sigma()) && a.unitarySigma().equals(b.unitarySigma())) {
        return Z.valueOf(mN);
      }
    }
  }
}

