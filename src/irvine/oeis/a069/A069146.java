package irvine.oeis.a069;

import irvine.factor.factor.Jaguar;
import irvine.factor.util.FactorSequence;
import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A069146 Numbers m such that m = sigma(abs(k)) - 3k, where k = sigma(m) - 3m.
 * @author Sean A. Irvine
 */
public class A069146 extends Sequence1 {

  private long mN = 1247;

  @Override
  public Z next() {
    while (true) {
      final Z n = Z.valueOf(++mN);
      final FactorSequence fs = Jaguar.factor(mN);
      final Z k = fs.sigma().subtract(n.multiply(3));
      if (Functions.SIGMA.z(k.abs()).subtract(k.multiply(3)).equals(n)) {
        return n;
      }
    }
  }
}

