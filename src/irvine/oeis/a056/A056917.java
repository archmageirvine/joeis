package irvine.oeis.a056;

import irvine.factor.factor.Jaguar;
import irvine.factor.util.FactorSequence;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A056917 Numbers n such that sigma(n)-phi(n) is a perfect square.
 * @author Sean A. Irvine
 */
public class A056917 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    while (true) {
      final FactorSequence fs = Jaguar.factor(++mN);
      if (fs.sigma().subtract(fs.phi()).isSquare()) {
        return Z.valueOf(mN);
      }
    }
  }
}
