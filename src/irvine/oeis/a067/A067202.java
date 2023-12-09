package irvine.oeis.a067;

import irvine.factor.factor.Jaguar;
import irvine.factor.util.FactorSequence;
import irvine.math.z.Euler;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A067202 Numbers n such that sigma(n) = phi(n) + phi(n-1) + phi(n-2).
 * @author Sean A. Irvine
 */
public class A067202 extends Sequence1 {

  private long mN = 2;

  @Override
  public Z next() {
    while (true) {
      final FactorSequence fs = Jaguar.factor(++mN);
      if (fs.sigma().equals(fs.phi().add(Euler.phi(mN - 1)).add(Euler.phi(mN - 2)))) {
        return Z.valueOf(mN);
      }
    }
  }
}

