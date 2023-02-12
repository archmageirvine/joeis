package irvine.oeis.a061;

import irvine.factor.factor.Jaguar;
import irvine.factor.util.FactorSequence;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A061366 Numbers n such that phi(n)+sigma(n) is a perfect cube.
 * @author Sean A. Irvine
 */
public class A061366 extends Sequence1 {

  private long mN = 98;

  @Override
  public Z next() {
    while (true) {
      final FactorSequence fs = Jaguar.factor(++mN);
      final Z t = fs.phi().add(fs.sigma());
      t.root(3);
      if (t.auxiliary() == 1) {
        return Z.valueOf(mN);
      }
    }
  }
}

