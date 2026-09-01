package irvine.oeis.a063;

import irvine.factor.factor.Jaguar;
import irvine.factor.util.FactorSequence;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A063870 Numbers k such that sigma(k) - usigma(k) = 3*k/2.
 * @author Sean A. Irvine
 */
public class A063870 extends Sequence1 {

  private long mN = 239;

  @Override
  public Z next() {
    while (true) {
      final FactorSequence fs = Jaguar.factor(2 * ++mN);
      if (fs.sigma().subtract(fs.unitarySigma()).equals(3L * mN)) {
        return Z.valueOf(2 * mN);
      }
    }
  }
}
