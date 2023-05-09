package irvine.oeis.a063;

import irvine.factor.factor.Jaguar;
import irvine.factor.util.FactorSequence;
import irvine.math.z.Euler;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A063693 Numbers k such that phi(k + d(k)) = phi(k) + d(k), where phi() = A000010(), d() = A000005().
 * @author Sean A. Irvine
 */
public class A063693 extends Sequence1 {

  private long mN = 2;

  @Override
  public Z next() {
    while (true) {
      final FactorSequence fs = Jaguar.factor(++mN);
      if (fs.sigma0().add(fs.phi()).equals(Euler.phi(fs.sigma0().add(mN)))) {
        return Z.valueOf(mN);
      }
    }
  }
}

