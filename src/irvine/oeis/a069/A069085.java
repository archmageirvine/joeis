package irvine.oeis.a069;

import irvine.factor.factor.Jaguar;
import irvine.factor.util.FactorSequence;
import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A069085 Abundant numbers n such that n = sigma(k) - 2k, where k = sigma(n) - 2n.
 * @author Sean A. Irvine
 */
public class A069085 extends Sequence1 {

  private long mN = 119;

  @Override
  public Z next() {
    while (true) {
      final Z n = Z.valueOf(++mN);
      final FactorSequence fs = Jaguar.factor(mN);
      final Z k = fs.sigma().subtract(n.multiply2());
      if (Functions.SIGMA.z(k).subtract(k.multiply2()).equals(n)) {
        return n;
      }
    }
  }
}

