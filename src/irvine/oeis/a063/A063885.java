package irvine.oeis.a063;

import irvine.factor.factor.Jaguar;
import irvine.factor.util.FactorSequence;
import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A063885 z(sigma(n)) = 2n, where z(n) = A048146.
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
      if (z(Functions.SIGMA.z(++mN)).equals(Z.valueOf(2 * mN))) {
        return Z.valueOf(mN);
      }
    }
  }
}
