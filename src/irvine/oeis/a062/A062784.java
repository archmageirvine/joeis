package irvine.oeis.a062;

import irvine.factor.factor.Jaguar;
import irvine.factor.util.FactorSequence;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A062784 Numbers k such that sigma(k) + phi(k) is a perfect square.
 * @author Sean A. Irvine
 */
public class A062784 extends Sequence1 {

  private long mN = 1;

  @Override
  public Z next() {
    while (true) {
      final FactorSequence fs = Jaguar.factor(++mN);
      if (fs.sigma().add(fs.phi()).isSquare()) {
        return Z.valueOf(mN);
      }
    }
  }
}
