package irvine.oeis.a011;

import irvine.factor.factor.Jaguar;
import irvine.factor.util.FactorSequence;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A011257 Geometric mean of phi(n) and sigma(n) is an integer.
 * @author Sean A. Irvine
 */
public class A011257 implements Sequence {

  private Z mN = Z.ZERO;

  @Override
  public Z next() {
    while (true) {
      mN = mN.add(1);
      final FactorSequence fs = Jaguar.factor(mN);
      if (fs.phi().multiply(fs.sigma()).sqrtAndRemainder()[1].isZero()) {
        return mN;
      }
    }
  }
}

