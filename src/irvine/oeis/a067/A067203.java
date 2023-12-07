package irvine.oeis.a067;

import irvine.factor.factor.Jaguar;
import irvine.factor.util.FactorSequence;
import irvine.math.z.Euler;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A067185.
 * @author Sean A. Irvine
 */
public class A067203 extends Sequence1 {

  private long mN = 1253;

  @Override
  public Z next() {
    while (true) {
      final FactorSequence fs = Jaguar.factor(++mN);
      if (fs.sigma().equals(fs.phi().add(Euler.phi(mN - 1)).add(Euler.phi(mN - 2)).add(Euler.phi(mN - 3)))) {
        return Z.valueOf(mN);
      }
    }
  }
}

