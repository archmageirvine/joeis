package irvine.oeis.a011;

import irvine.factor.factor.Cheetah;
import irvine.factor.util.FactorSequence;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A011251 Numbers n such that phi(n) + sigma(n) = 3n.
 * @author Sean A. Irvine
 */
public class A011251 implements Sequence {

  private Z mN = Z.valueOf(310);

  @Override
  public Z next() {
    while (true) {
      mN = mN.add(2);
      final FactorSequence fs = Cheetah.factor(mN);
      if (fs.phi().add(fs.sigma()).equals(mN.multiply(3))) {
        return mN;
      }
    }
  }
}

