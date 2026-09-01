package irvine.oeis.a063;

import irvine.factor.factor.Jaguar;
import irvine.factor.util.FactorSequence;
import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A063885 Numbers k such that z(sigma(k)) = 2*k, where z(k) = A048146(k).
 * @author Sean A. Irvine
 */
public class A063885 extends Sequence1 {

  private long mN = 23;

  private Z z(final Z n) {
    final FactorSequence fs = Jaguar.factor(n);
    return fs.sigma().subtract(fs.unitarySigma());
  }

  @Override
  public Z next() {
    while (true) {
      if (z(Functions.SIGMA1.z(++mN)).equals(2 * mN)) {
        return Z.valueOf(mN);
      }
    }
  }
}
