package irvine.oeis.a011;

import irvine.factor.factor.Cheetah;
import irvine.factor.util.FactorSequence;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A011254 Numbers n such that phi(n) + sigma(n) <code>= 4n</code>.
 * @author Sean A. Irvine
 */
public class A011254 implements Sequence {

  private Z mN = Z.valueOf(23758);

  @Override
  public Z next() {
    while (true) {
      mN = mN.add(2);
      final FactorSequence fs = Cheetah.factor(mN);
      if (fs.phi().add(fs.sigma()).equals(mN.multiply(4))) {
        return mN;
      }
    }
  }
}

