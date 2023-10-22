package irvine.oeis.a066;

import irvine.factor.factor.Jaguar;
import irvine.factor.util.FactorSequence;
import irvine.math.z.Euler;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A066465 Numbers n such that sigma(phi(sigma(n))) = phi(n).
 * @author Sean A. Irvine
 */
public class A066465 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    while (true) {
      final FactorSequence fs = Jaguar.factor(++mN);
      if (Jaguar.factor(Euler.phi(fs.sigma())).sigma().equals(fs.phi())) {
        return Z.valueOf(mN);
      }
    }
  }
}

