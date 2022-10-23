package irvine.oeis.a057;

import irvine.factor.factor.Jaguar;
import irvine.factor.util.FactorSequence;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A057654 Numbers n such that sigma(n)^2 - phi(n)^2 is a perfect square.
 * @author Sean A. Irvine
 */
public class A057654 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    while (true) {
      final FactorSequence fs = Jaguar.factor(++mN);
      if (fs.sigma().square().subtract(fs.phi().square()).isSquare()) {
        return Z.valueOf(mN);
      }
    }
  }
}
