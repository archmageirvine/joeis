package irvine.oeis.a043;

import irvine.factor.factor.Jaguar;
import irvine.factor.util.FactorSequence;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A043293 Numbers n such that lcm(sigma(n),phi(n)) is a perfect square.
 * @author Sean A. Irvine
 */
public class A043293 implements Sequence {

  private long mN = 0;

  @Override
  public Z next() {
    while (true) {
      final FactorSequence fs = Jaguar.factor(++mN);
      if (fs.phi().lcm(fs.sigma()).isSquare()) {
        return Z.valueOf(mN);
      }
    }
  }
}

