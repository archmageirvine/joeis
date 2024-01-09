package irvine.oeis.a067;

import irvine.factor.factor.Jaguar;
import irvine.factor.util.FactorSequence;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A067811 Numbers n such that phi(n)^2 + sigma(n)^2 is an integer square.
 * @author Sean A. Irvine
 */
public class A067811 extends Sequence1 {

  private long mN = 6;

  @Override
  public Z next() {
    while (true) {
      final FactorSequence fs = Jaguar.factor(++mN);
      if (fs.sigma().square().add(fs.phi().square()).isSquare()) {
        return Z.valueOf(mN);
      }
    }
  }
}
